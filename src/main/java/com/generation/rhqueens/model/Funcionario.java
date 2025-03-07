package com.generation.rhqueens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome é obrigatório")
	@Size(min = 5, max = 100, message = "O nome precisa ser maior que 5 e menor que 100")
	private String nome;
		
	@NotBlank(message = "O atributo cpf é obrigatório")
	@Size(min = 5, max = 100, message = "O cpf precisa ser maior que 5 e menor que 11")
	private String cpf;
	
	@NotBlank(message = "O atributo cargo é obrigatório")
	@Size(min = 5, max = 100, message = "O cargo precisa ser maior que 5 e menor que 100")
	private String cargo;
	
	@NotNull(message="Salatio não pode ser nulo")
	@DecimalMin(value="0.0", inclusive=true,
	message = "Salário precisa ser maior ou igual a zero")	
	private Double salario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
}
