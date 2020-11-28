package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

/* Fazer um programa para ler os dados de um produto em estoque (nome, preço e
   quantidade no estoque). Em seguida:
•  Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
   estoque)
•  Realizar uma entrada no estoque e mostrar novamente os dados do produto
•  Realizar uma saída no estoque e mostrar novamente os dados do produto */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		p.setNome(sc.nextLine());
		System.out.print("Preço: ");
		p.setPreco(sc.nextDouble());
		System.out.print("Quantidade no Estoque: ");
		p.setQtde(sc.nextInt());
		
		System.out.println();
		System.out.println("Dados do Produto");
		System.out.println("================");
		System.out.println(p);
		
		System.out.println();
		System.out.print("Entre o número de produtos para adicionar ao estoque: ");
		p.adicionarProdutos(sc.nextInt());
		
		System.out.println("Dados atualizados:");
		System.out.println("==================");
		System.out.println(p);
		
		System.out.println();
		System.out.print("Entre o número de produtos para remover do estoque: ");
		p.removeProdutos(sc.nextInt());
		
		System.out.println("Dados atualizados:");
		System.out.println("==================");
		System.out.println(p);
		
		sc.close();
	}
}
