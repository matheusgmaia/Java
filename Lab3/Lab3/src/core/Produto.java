/*114210417 - Matheus Gomes Maia - Turma1*/
package core;

import java.util.Scanner;

public class Produto {
	//Atributos de cada produto
	private String nome;
	private double preco;
	private String tipo;
	private int quantidade;
	
	//Atributos da Classe
	public static int index = 0;
	public static double totalDeVendas = 0;
	private static Produto[] listaDeProdutos = new Produto[5];

	public Produto(String nome2, double preco2, String tipo2, int quantidade2) {
		this.nome = nome2;
		this.preco = preco2;
		this.tipo = tipo2;
		this.quantidade = quantidade2;
		if (index == getListaDeProdutos().length){
			dobraLista();
		}
		getListaDeProdutos()[index] = this;
		Produto.index++;
		
	}

	private void dobraLista() {
		Produto[] novoArray = new Produto[getListaDeProdutos().length*2];
		System.arraycopy(getListaDeProdutos(), 0, novoArray, 0, getListaDeProdutos().length);
		Produto.setListaDeProdutos(novoArray);
	}

	public static String cadastroProduto(Scanner sc){
		String nome;
		double preco;
		String tipo;
		String retorno;
		int quantidade;
		System.out.print("Digite o nome do produto:");
		nome = sc.next();
		System.out.print("Digite o pre�o unitario do produto:");
		preco = sc.nextDouble();
		System.out.print("Digite o tipo do produto:");
		tipo = sc.next();
		System.out.print("Digite a quantidade no estoque:");
		quantidade = sc.nextInt();
		new Produto(nome, preco, tipo, quantidade);
		System.out.println("(" + quantidade + ")" + nome + "(s) cadastrado com sucesso.\n");
		System.out.print("Deseja cadastrar outro produto?");
		retorno = sc.next();
		return retorno;
		
	}

	public String getNome() {
		return nome;
	}
	
	public double getQuantidadeQuePode() {
		return quantidade*preco;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public static String vendaProduto(Scanner sc) {
		String nome;
		String retorno;
		int quantidade;
		
		System.out.print("Digite o nome do Produto:");
		nome = sc.next();
		
		if (produtoCadastrado(nome)){
			Produto produtoaVender = idProduto(nome);
			System.out.println("==>" + produtoaVender.nome + "(" + produtoaVender.tipo + ").R$" +
			produtoaVender.preco);
			System.out.print("Digite a quantidade que deseja vender:");
			quantidade = sc.nextInt();
			if (quantidade < produtoaVender.getQuantidade()){
				produtoaVender.quantidade -= quantidade;
				Produto.totalDeVendas += (produtoaVender.getPreco() * quantidade);
			}
			else{
				System.out.println("N�o � poss�vel vender pois n�o h� " + produtoaVender.getNome() + " suficiente.");
			}
		}
		else
			System.out.println("==>" + nome +"nao cadastrado no sistema.");
		
		System.out.print("Deseja vender outro produto?");
		retorno = sc.next();
		return retorno;
	}

	private static Produto idProduto(String nome2) {
		for(int i = 0; i<Produto.index;i++){
			if (getListaDeProdutos()[i].nome.equals(nome2)){
				return getListaDeProdutos()[i];
			};
		}
		return null;
	}
	
	private static boolean produtoCadastrado(String nome2) {
		for(int i = 0; i<Produto.index;i++){
			if(getListaDeProdutos()[i].nome.equals(nome2)){
				return true;
			}
			else if (getListaDeProdutos()[i].nome.equals(null)){
				break;
			}
		}
		
		return false;
	}

	public static void imprimirBalanco() {
		double vendaPossivel = 0;
		System.out.println("==== Impressao de Balanco ====\n"
				+ "Produtos cadastrados:");
		
		for(int i = 0; i<Produto.index;i++){
			System.out.println("	" + (i+1) + ") " + getListaDeProdutos()[i].getNome() +"("+getListaDeProdutos()[i].getTipo() +").R$ " + getListaDeProdutos()[i].getPreco() + " Restante:" + getListaDeProdutos()[i].getQuantidade());
			vendaPossivel += getListaDeProdutos()[i].getQuantidadeQuePode();
		}
		System.out.println("Total arrecadado em vendas: R$ " + Produto.totalDeVendas);
		System.out.println("Total que pode ser arrrecadado: R$ " + vendaPossivel + "\n");
		
	}

	public static Produto[] getListaDeProdutos() {
		return listaDeProdutos;
	}

	public static void setListaDeProdutos(Produto[] listaDeProdutos) {
		Produto.listaDeProdutos = listaDeProdutos;
	}

	
	
	
}
