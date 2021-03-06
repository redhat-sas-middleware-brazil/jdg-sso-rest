package br.com.ptrck.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto implements Serializable{
	
	private String nome;
	private Double preco;
	private Integer codBarras;

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

	public Integer getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(Integer codBarras) {
		this.codBarras = codBarras;
	}

	public Produto(String nome, Double preco, Integer codBarras) {
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
	}

	public Produto() {

	}
	
	@Override
	public String toString() {
		return this.nome + " - R$ "+ this.preco + " - " + this.codBarras;
	}
	

}
