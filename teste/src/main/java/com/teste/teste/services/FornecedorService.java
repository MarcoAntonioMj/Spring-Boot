package com.teste.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.teste.repositories.FornecedorRepository;

import com.teste.teste.Fornecedor;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository repository;

    public List<Fornecedor> buscarPorNome(String nome) {
        return repository.findByNome(nome);
    }

}
