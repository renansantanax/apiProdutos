package br.com.cotiinformatica.repositories;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.factories.ConnectionFactory;
public class CategoriaRepository {
	//declarando um objeto da classe ConnectionFactory
	private ConnectionFactory connectionFactory = new ConnectionFactory();
	
	/*
	 * Método para consultar todas as categorias
	 * cadastradas no banco de dados
	 */
	public List<Categoria> findAll() {
		
		try {			
			//abrir conexão com o banco de dados
			var connection = connectionFactory.getConnection();
			
			//executando uma consulta para trazer todas as categorias em ordem alfabética
			var statement = connection.prepareStatement("select * from categoria order by nome");
			var result = statement.executeQuery(); //captura o resultado obtido da consulta
			
			var lista = new ArrayList<Categoria>();
			
			//percorrer cada registro obtido do banco de dados
			while(result.next()) {
				var categoria = new Categoria();
				categoria.setId(UUID.fromString(result.getString("id")));
				categoria.setNome(result.getString("nome"));
				
				lista.add(categoria); //adicionar cada categoria dentro da lista
			}
			
			//fechando a conexão
			connection.close();
			
			return lista; //retornando a lista de categorias
		}
		catch(Exception e) {
			e.printStackTrace(); //imprimir um log de erro
			return null; //retornando vazio
		}		
	}
}


