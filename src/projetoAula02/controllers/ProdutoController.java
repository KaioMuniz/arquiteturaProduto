package projetoAula02.controllers;

import projetoAula02.domain.interfaces.ProdutoService;
import projetoAula02.domain.service.ProdutoServiceImpl;

public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController() {
        this.produtoService = new ProdutoServiceImpl();
    }

    public void executarCadastro() {
        produtoService.cadastrar();
    }

//teste

}
