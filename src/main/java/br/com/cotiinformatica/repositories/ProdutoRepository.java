package br.com.cotiinformatica.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.entities.Produto;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class ProdutoRepository {

	private ConnectionFactory connectionFactory = new ConnectionFactory();

	// método para inserir um produto no banco de dados
	public void create(Produto produto, UUID categoriaId) {
		try {

			var connection = connectionFactory.getConnection();

			var statement = connection.prepareStatement(
					"INSERT INTO produto(id, nome, preco, quantidade, categoria_id) VALUES(?,?,?,?,?)");
			statement.setObject(1, produto.getId());
			statement.setString(2, produto.getNome());
			statement.setDouble(3, produto.getPreco());
			statement.setInt(4, produto.getQuantidade());
			statement.setObject(5, categoriaId);
			statement.execute();

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Método para atualizar os dados de um produto
	public void update(Produto produto, UUID categoriaId) {

		try {

			var connection = connectionFactory.getConnection();

			var statement = connection
					.prepareStatement("UPDATE produto SET nome=?, preco=?, quantidade=?, categoria_id=? WHERE id=?");
			statement.setString(1, produto.getNome());
			statement.setDouble(2, produto.getPreco());
			statement.setInt(3, produto.getQuantidade());
			statement.setObject(4, categoriaId);
			statement.setObject(5, produto.getId());
			statement.execute();

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delete(UUID id) {
		try {

			var connection = connectionFactory.getConnection();
			var statement = connection.prepareStatement("DELETE FROM produto WHERE id=?");
			statement.setObject(1, id);
			statement.execute();

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Método para consultar produtos através do nome
	public List<Produto> findAll(String nome) {
		try {

			var connection = connectionFactory.getConnection();

			var statement = connection.prepareStatement("SELECT * FROM produto WHERE nome ILIKE ? ORDER BY nome");
			statement.setString(1, "%" + nome + "%");
			var result = statement.executeQuery();

			var lista = new ArrayList<Produto>();

			while (result.next()) {

				var produto = new Produto();

				produto.setId(UUID.fromString(result.getString("id")));
				produto.setNome(result.getString("nome"));
				produto.setPreco(result.getDouble("preco"));
				produto.setQuantidade(result.getInt("quantidade"));

				lista.add(produto);

			}

			connection.close();

			return lista;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
