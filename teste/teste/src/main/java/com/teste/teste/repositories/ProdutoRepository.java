package com.teste.teste.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.teste.produto;

public interface ProdutoRepository extends JpaRepository<produto, Long> {
    List<produto> findByNome(String nome);
}