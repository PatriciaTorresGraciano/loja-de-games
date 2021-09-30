package br.com.generation.loja.games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "tb_produto")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;
	
	@NotNull
	@Size (min = 2, max = 50)
	private String nomeProduto;

	@NotNull
	@Size (min = 2, max = 500)
	private String imagemProduto;
	
	@NotNull
	private double precoProduto;
	
	@NotNull
	private int qtProduto;

	@NotNull
	@Size (min = 2, max = 500)
	private String descricaoProduto;
	

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public int getQtProduto() {
		return qtProduto;
	}

	public void setQtProduto(int qtProduto) {
		this.qtProduto = qtProduto;
	}
	
	
	

}
