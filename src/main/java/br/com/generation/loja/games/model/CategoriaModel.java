package br.com.generation.loja.games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "tb_categoria")
public class CategoriaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCategoria;
	
	@NotBlank
	private String nomeLoja;

	@NotBlank
	private String tipoProduto;
	
	//mappedBy --> Indicar qual o campo da outra tabela que faz ligação com o atributo produto
	// cascade --> Ao excluir uma categoria exclui todos produtos vinculados a ela, sem dar erro
	//JsonIgnoreProperties --> Evitar recursividade, ou seja, chamar várias vezes categoria e produto  
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL) 
	@JsonIgnoreProperties("categoria") 
	private List<ProdutoModel> produtos;
	
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

	public List<ProdutoModel> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoModel> produtos) {
		this.produtos = produtos;
	}

	
}
