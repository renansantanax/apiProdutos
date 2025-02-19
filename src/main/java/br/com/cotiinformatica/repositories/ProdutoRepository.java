package br.com.cotiinformatica.repositories;

import java.util.UUID;

import br.com.cotiinformatica.entities.Produto;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class ProdutoRepository {

	private ConnectionFactory connectionFactory = new ConnectionFactory();
	
	// método para inserir um produto no banco de dados
	public void create(Produto produto, UUID categoriaId) {
		try {
			
			var connection = connectionFactory.getConnection();
			
			var statement = connection.prepareStatement("INSERT INTO produto(id, nome, preco, quantidade, categoria_id) VALUES(?,?,?,?,?)");
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
	
}
