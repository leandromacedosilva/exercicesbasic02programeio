package com.exercicesbasic02programeio.util;

public class Product {
	private String codigoDeBarras;
	private String descricao;
	private float preco;
	private float quantidade;
	private float desconto;
	
	public Product() {}

	public Product(String codigoDeBarras, String descricao, float preco, float quantidade) {
		super();
		this.codigoDeBarras = codigoDeBarras;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void productPrinter() {
		if(quantidade <= 10) {
			System.out.println("ATENCAO: NESTA COMPRA NAO HOUVE DESCONTO.");
			System.out.println("CODIGO DE BARRAS: " + this.codigoDeBarras);
			System.out.println("PRODUTO: " + this.descricao);
			System.out.println("PRECO R$: " + this.preco);
			System.out.println("QUANTIDADE: " + this.quantidade);
			System.out.printf("TOTAL R$: %.2f ", (this.preco * this.quantidade));
			}
		else if(quantidade >= 11 && quantidade <= 20) {
			//desconto = (this.preco * this.quantidade) * 0.1f;
			System.out.println("ATENCAO: NESTA COMPRA HOUVE 10% DE DESCONTO.");
			System.out.println("CODIGO DE BARRAS: " + this.codigoDeBarras);
			System.out.println("PRODUTO: " + this.descricao);
			System.out.println("PRECO R$: " + this.preco);
			System.out.println("QUANTIDADE: " + this.quantidade);
			System.out.printf("TOTAL R$: %.2f", (this.preco * this.quantidade));
			System.out.printf("\nTOTAL DESCONTO R$: %.2f", ((this.preco * this.quantidade) * 0.1));
			System.out.printf("\nTOTAL COM DESCONTO R$: %.2f", (this.preco * this.quantidade - (this.preco * this.quantidade) * 0.1));
			}
		else if(quantidade >= 21 && quantidade <= 50) {
			//desconto = (this.preco * this.quantidade) * 0.2f;
			System.out.println("ATENCAO: NESTA COMPRA HOUVE 20% DE DESCONTO.");
			System.out.println("CODIGO DE BARRAS: " + this.codigoDeBarras);
			System.out.println("PRODUTO: " + this.descricao);
			System.out.println("PRECO R$: " + this.preco);
			System.out.println("QUANTIDADE: " + this.quantidade);
			System.out.printf("TOTAL R$: %.2f", (this.preco * this.quantidade), "\n");
			System.out.printf("\nTOTAL DESCONTO R$: %.2f", ((this.preco * this.quantidade) * 0.2));
			System.out.printf("\nTOTAL COM DESCONTO R$: %.2f", (this.preco * this.quantidade  - (this.preco * this.quantidade) * 0.2));
			}
		else if(quantidade > 50 ) {
			//desconto = (this.preco * this.quantidade) * 0.25f;
			System.out.println("ATENCAO: NESTA COMPRA HOUVE 25% DE DESCONTO.");
			System.out.println("CODIGO DE BARRAS: " + this.codigoDeBarras);
			System.out.println("PRODUTO: " + this.descricao);
			System.out.println("PRECO R$: " + this.preco);
			System.out.println("QUANTIDADE: " + this.quantidade);
			System.out.printf("TOTAL R$: %.2f", (this.preco * this.quantidade), "\n");
			System.out.printf("\nTOTAL DESCONTO R$: %.2f", ((this.preco * this.quantidade) * 0.25));
			System.out.printf("\nTOTAL COM DESCONTO R$: %.2f", (this.preco * this.quantidade  - (this.preco * this.quantidade) * 0.25));
			}
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
	

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Product [codigoDeBarras=" + codigoDeBarras + ", descricao=" + descricao + ", preco=" + preco
				+ ", quantidade=" + quantidade + "]";
	}

}
