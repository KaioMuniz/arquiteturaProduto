package projetoAula02.repository;

import java.io.PrintWriter;

import projetoAula02.domain.entities.Produto;

public class ProdutoRepository {

	public void exportarParaXml(Produto produto) {
		try {
			var printWriter = new PrintWriter("c:\\temp\\produto_" + produto.getId() + ".xml");
			printWriter.write("<?xml version='1.0' encoding='ISO-8859-1'?>");
			printWriter.write("<PRODUCT>");
			printWriter.write("<ID>" + produto.getId() + "</ID>");
			printWriter.write("<NAME>" + produto.getNome() + "</NAME>");
			printWriter.write("<QUANTITY>" + produto.getQuantidade() + "</QUANTITY>");
			printWriter.write("<REGISTRATIONTIME>" + produto.getDataHoraCriacao() + "</REGISTRATIONTIME>");
			printWriter.write("</PRODUCT>");

			printWriter.close();
			System.out.println("\nArquivo XML gravado com sucesso!");
		} catch (Exception e) {
			System.out.println("Falha ao gravar XML: " + e.getMessage());
		}
	}
}