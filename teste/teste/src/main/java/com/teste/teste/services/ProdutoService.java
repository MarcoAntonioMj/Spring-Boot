package com.teste.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.teste.produto;
import com.teste.teste.repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<produto> buscarPorNome(String nome) {
        return repository.findByNome(nome);
    }
}


