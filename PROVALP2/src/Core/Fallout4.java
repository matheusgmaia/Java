package Core;

import java.util.Scanner;

import UI.Tela;

public class Fallout4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tela tela = new Tela();
		Gerenciador gerenciador = new Gerenciador();
		gerenciador.menuPrincipal(sc, tela);

	}
}
