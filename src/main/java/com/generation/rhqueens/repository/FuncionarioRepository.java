package com.generation.rhqueens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.rhqueens.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	public List<Funcionario> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
