package com.teste.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.Fornecedor;
import com.teste.teste.services.FornecedorService;




@RestController
@RequestMapping("/produtoos")
public class FornecedorConntroller {
    @Autowired
    private FornecedorService fornecedorService;
    @GetMapping("/[nome]")
    public List<Fornecedor> buscarPorNome(@PathVariable String nome){
        return fornecedorService.buscarPorNome(nome);
    }
    
}
