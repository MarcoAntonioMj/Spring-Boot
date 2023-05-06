package com.teste.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.produto;
import com.teste.teste.services.ProdutoService;




@RestController
@RequestMapping("/produtoos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @GetMapping("/[nome]")
    public List<produto> buscarPorNome(@PathVariable String nome){
        return produtoService.buscarPorNome(nome);
    }
    @GetMapping("/fornecedor/{nomeFornecedor}")
    public List<produto> buscarPorFornecedor(@PathVariable String nomeFornecedor){
        return produtoService.buscarPorFornecedor(nomeFornecedor);
    }
}
