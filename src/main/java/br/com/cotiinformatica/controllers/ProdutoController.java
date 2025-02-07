package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@PostMapping("cadastrar")
	public void cadastrar() {
		// TODO
	}

	@PutMapping("atualizar")
	public void atualizar() {
		// TODO 
	}
	
	@DeleteMapping("excluir")
	public void excluir() {
		// TODO
	}
	
	@GetMapping("consultar")
	public void consultar() {
		// TODO
	}
	
}
