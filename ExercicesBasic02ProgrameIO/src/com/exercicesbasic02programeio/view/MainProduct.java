package com.exercicesbasic02programeio.view;

import java.io.PrintStream;
import java.util.Scanner;

import com.exercicesbasic02programeio.util.Product;

public class MainProduct {
	public static void main(String[] args) {
		PrintStream pst = System.out;
		Scanner input = new Scanner(System.in);
		
		pst.println("INFORME OS DADOS DO PRODUTO");
		pst.println("-------------------------------------------------------------------");
		pst.print("CODIGO DE BARRAS: ");
		String codigoDeBarras = input.nextLine();
		pst.print("PRODUTO: ");
		String descricao = input.nextLine();
		pst.print("PRECO: ");
		float preco = input.nextFloat();
		pst.print("QUANTIDADE: ");
		float quantidade = input.nextFloat();
		pst.println();
		pst.println("INFORMACOES DA COMPRA/VENDA");
		pst.println("-------------------------------------------------------------------");
		Product product = new Product(codigoDeBarras, descricao, preco, quantidade);
		product.productPrinter();
		
		input.close();
	}

}
