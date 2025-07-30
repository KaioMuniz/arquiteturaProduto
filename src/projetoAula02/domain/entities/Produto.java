package projetoAula02.domain.entities;

import java.time.LocalDateTime;
import java.util.UUID;



public class Produto {
	
	private UUID id;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private LocalDateTime dataHoraCriacao;
	
	
	public Produto() {
		super();
	}
	
	

	public Produto(UUID id, String nome, Double preco, Integer quantidade, LocalDateTime dataHoraCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.dataHoraCriacao = dataHoraCriacao;
	}
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDateTime getDataHoraCriacao() {
		return dataHoraCriacao;
	}
	public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
	}



	
	
	

}
