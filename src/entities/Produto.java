package entities;

public class Produto {

	// Variaveis ==============================================================
	private String nome;
	private double preco;
	private int qtde;
	
	
	// Construtores ===========================================================
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int qtde) {
		this.nome=nome;
		this.preco=preco;
		this.qtde=qtde;
	}

	// Getters & Setters ======================================================
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	// Método para retornar o valor total no estoque ==========================
	public double valorTotalNoEstoque() {
		return this.preco * this.qtde;
	}
	
	// Método para adicionar no estoque =======================================
	public void adicionarProdutos(int qtde) {
		this.qtde += qtde;
	}
	
	// Método para remover do estoque =========================================
	public void removeProdutos(int qtde) {
		this.qtde -= qtde;
	}
	@Override
	public String toString() {
		return this.nome 
				+ ", $ " 
				+ String.format("%.2f", this.preco) 
				+ ", " 
				+ this.qtde 
				+ " unidades, Total: $ " 
				+ String.format("%.2f", this.valorTotalNoEstoque()); 
	}
}


