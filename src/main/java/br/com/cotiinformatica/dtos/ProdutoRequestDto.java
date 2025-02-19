package br.com.cotiinformatica.dtos;

import java.util.UUID;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoRequestDto {
	
	@Size(min = 8, max = 100, message = "Por favor, informe o nome com no mínimo 8 e no máximo 100 caracteres.")
	@NotBlank(message = "Por favor, informe o nome do produto.")
	private String nome;
	
	@DecimalMin(value = "0.01", message = "Por favor, informe o preço com valor mínimo de '0.01'.")
	@Digits(integer = 10, fraction = 2, message = "O preço deve ter no máximo 10 dígitos e 2 casas decimais.")
	@NotNull(message = "Por favor, informe o preço do produto.")
	private Double preco;
	
	@Min(value = 0, message = "Por favor, informe a quantidade do produto.")
	@NotNull(message = "Por favor, informe a quantidade do produto.")
	private Integer quantidade;
	
	@NotNull(message = "Por favor, informe a categoria do produto.")
	private UUID categoriaId;

}
