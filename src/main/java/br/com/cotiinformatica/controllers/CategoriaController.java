package br.com.cotiinformatica.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.repositories.CategoriaRepository;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

	@Operation(summary = "Serviço para consultar todas as categorias.")
	@GetMapping("consultar")
	public List<Categoria> consultar() {
		
		//instanciando a classe de repositorio
		var categoriaRepository = new CategoriaRepository();
		
		return categoriaRepository.findAll();
	}
	
}
