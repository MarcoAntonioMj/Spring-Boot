package com.teste.teste.repositories;
import com.teste.teste.Fornecedor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    List<Fornecedor> findByNome(String nome);
}