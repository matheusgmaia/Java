package core;

import java.util.Scanner;

import ui.Menu;

public class EconomizaP2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		
		loopPrincipal:
		while (true){
		//Menu Principal
		int iopcao = menu.menuPrincipal(sc);
		
		switch (iopcao) {
		case 1:
			cadastroDeProdutos(sc);
			break;

		case 2:
			vendaDeProdutos(sc);
			break;
			
		case 3:
			Produto.imprimirBalanco();
			break;
			
		default:
			break loopPrincipal;
		}
		}

}

	private static void cadastroDeProdutos(Scanner sc) {
		String continuar1 = "Sim";
		System.out.println("==== Cadastro de Produtos ====");
		while (continuar1.equals("Sim")){
			continuar1 = Produto.cadastroProduto(sc);
		}
	}

	private static void vendaDeProdutos(Scanner sc) {
		String continuar2 = "Sim";
		System.out.println("==== Venda de Produtos ====");
		while (continuar2.equals("Sim")){
			continuar2 = Produto.vendaProduto(sc);
		}
	}

}
