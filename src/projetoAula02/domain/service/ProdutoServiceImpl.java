package projetoAula02.domain.service;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.swing.JOptionPane;

import projetoAula02.domain.dto.ProdutoRequest;
import projetoAula02.domain.dto.ProdutoResponse;
import projetoAula02.domain.entities.Produto;
import projetoAula02.domain.interfaces.ProdutoService;
import projetoAula02.repository.ProdutoRepository;

public class ProdutoServiceImpl implements ProdutoService {

	@Override
	public void cadastrar() {

        var nome = JOptionPane.showInputDialog("Informe o nome:");
        var precoStr = JOptionPane.showInputDialog("Informe o preco:");
        var quantidadeStr = JOptionPane.showInputDialog("Informe a quantidade:");

        double preco = Double.parseDouble(precoStr);
        int quantidade = Integer.parseInt(quantidadeStr);

        var request = new ProdutoRequest(nome, preco, quantidade);

        var produto = new Produto();
        produto.setId(UUID.randomUUID());
        produto.setNome(request.nome());
        produto.setPreco(request.preco());
        produto.setQuantidade(request.quantidade());
        produto.setDataHoraCriacao(LocalDateTime.now());

        var produtoRepository = new ProdutoRepository();
        produtoRepository.exportarParaXml(produto);

        var response = new ProdutoResponse(
            produto.getId(),
            produto.getNome(),
            produto.getPreco(),
            produto.getQuantidade(),
            produto.getDataHoraCriacao()
        );

        // Exibindo resumo (opcional)
        JOptionPane.showMessageDialog(null,
            "Produto cadastrado com sucesso!\n\n" +
            "ID: " + response.id() + "\n" +
            "Nome: " + response.nome() + "\n" +
            "Preço: R$ " + response.preco() + "\n" +
            "Quantidade: " + response.quantidade() + "\n" +
            "Data/Hora: " + response.dataHoraCriacao()
        );
    }
	
	
	
	

}
