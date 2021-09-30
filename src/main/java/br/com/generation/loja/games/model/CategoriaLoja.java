package br.com.generation.loja.games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "tb_categoria")
public class CategoriaLoja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCategoria;
	
	@NotNull
	@Size (min = 2, max = 50)
	private String nomeLoja;

	@NotNull
	@Size (min = 2, max = 200)
	private String tipoProduto;

	
	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	
}
