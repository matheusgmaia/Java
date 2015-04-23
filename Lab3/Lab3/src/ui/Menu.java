/*114210417 - Matheus Gomes Maia - Turma1*/
package ui;

import java.util.Scanner;

public class Menu {
	
	public void imprimirMenuPrincipal(){
		System.out.print("==== Bem-vindo(a) ao EconomizaP2 ====\n"
				+ "Digita a opcao desejada:\n"
				+ "1 - Cadastrar um Produto\n"
				+ "2 - Vender um Produto\n"
				+ "3 - Imprimir Balanço\n"
				+ "4 - Sair\n\n"
				+ "Opcao: ");
	}
		
	public int menuPrincipal(Scanner sc){
		Menu menu = new Menu();
		menu.imprimirMenuPrincipal();
		int iopcao = entradaMenuPrincipal(sc);
		return iopcao;
	}
		
	 public int entradaMenuPrincipal(Scanner sc){
			int entrada = sc.nextInt();
			return entrada;
	 }
	
}
