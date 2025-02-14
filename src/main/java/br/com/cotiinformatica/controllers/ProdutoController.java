package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Operation(summary = "Serviço para cadastrar produto.")
	@PostMapping("cadastrar")
	public void cadastrar() {
		// TODO
	}

	@Operation(summary = "Serviço para atualizar produto.")
	@PutMapping("atualizar")
	public void atualizar() {
		// TODO 
	}
	
	@Operation(summary = "Serviço para excluir produto.")
	@DeleteMapping("excluir")
	public void excluir() {
		// TODO
	}
	
	@Operation(summary = "Serviço para consultar todos os produtos.")
	@GetMapping("consultar")
	public void consultar() {
		// TODO
	}
	
}
