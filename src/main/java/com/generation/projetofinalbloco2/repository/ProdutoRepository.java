package com.generation.projetofinalbloco2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.projetofinalbloco2.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

}
