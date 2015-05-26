package Core;

import java.util.ArrayList;
import java.util.Scanner;


import UI.Tela;

public class Gerenciador {

	private static final int CRIARPERSONAGEM = 1;
	private static final int VERPERSONAGENS = 2;
	private static final int SENSODEDIRECAO = 1;
	private static final int REFLEXOS = 2;
	private static final int MEMORIA = 3;
	private static final int POLIGLOTA = 4;
	private static final int MIOPE = 1;
	private static final int PREGUICA = 2;
	private static final int DANCA = 1;
	private static final int CIRURGIA = 2;
	
	private ArrayList<Personagem> personagens = new ArrayList<Personagem>();

	private Personagem criarPersonagem(Scanner sc, Tela tela) {
		Personagem personagem = criacaoDePersonagem(sc);
		colocarAtributos(personagem, sc, tela);
		return personagem;
	}

	private void colocarAtributos(Personagem personagem, Scanner sc, Tela tela) {
		int pontosRestantes = personagem.getTotalDePontos();
		int opcao;
		do {
			tela.exibeMenuDeAtributos(pontosRestantes);
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				double forca;
				System.out.println("Quanto de força?");
				forca = sc.nextDouble();
				personagem.setForcaFR(forca);
				System.out.println("Voce ainda tem:"
						+ personagem.getTotalDePontos());
				break;
			case 2:
				double dextreza;
				System.out.println("Quanto de desxtreza?");
				dextreza = sc.nextDouble();
				personagem.setDextrezaDZ(dextreza);
				System.out.println("Voce ainda tem:"
						+ personagem.getTotalDePontos());
				break;
			case 3:
				double inteligencia;
				System.out.println("Quanto de inteligencia?");
				inteligencia = sc.nextDouble();
				personagem.setInteligenciaQI(inteligencia);
				System.out.println("Voce ainda tem:"
						+ personagem.getTotalDePontos());
				break;
			case 4:
				double vitalidade;
				System.out.println("Quanto de força?");
				vitalidade = sc.nextDouble();
				personagem.setVitalidadeVT(vitalidade);
				System.out.println("Voce ainda tem:"
						+ personagem.getTotalDePontos());
				break;
			case 5:
				personagem.resumirAtributos();
				break;
			default:
				break;
			}
		} while (opcao != 6);
	}

	private Personagem criacaoDePersonagem(Scanner sc) {
		System.out.print("<Criacao de Personagem>\n Nome:");
		String nome = sc.next();
		System.out.println("Altura:");
		Double altura = sc.nextDouble();
		System.out.println("Idade:");
		int idade = sc.nextInt();
		Personagem personagem = new Personagem(nome, altura, idade);
		return personagem;
	}

	public void menuPrincipal(Scanner sc, Tela tela) {
		int opcao;
		do {
			tela.exibeMenuPrincipal();
			opcao = sc.nextInt();
			switch (opcao) {
			case CRIARPERSONAGEM:
				Personagem personagem = criarPersonagem(sc, tela);
				break;

			case VERPERSONAGENS:
				for (Personagem personagem1 : personagens)
					personagem1.resumir();
				break;

			default:
				break;
			}
		} while (opcao != 3);
	}


	public void colocaVantagem(int i, Personagem personagem) {
		if(i == SENSODEDIRECAO){
			personagem.setTotalDePontos(personagem.getTotalDePontos() - 35);
			personagem.setDextrezaDZ(personagem.getDextrezaDZ()*1.05);
			personagem.Vantagens.add("Senço de Direçao");
		}
		else if(i == REFLEXOS){
			personagem.setTotalDePontos(personagem.getTotalDePontos() - 10);
			personagem.setDextrezaDZ(personagem.getDextrezaDZ()*1.05);
			personagem.Vantagens.add("Reflexos");
		}
		else if(i == MEMORIA){
			personagem.setTotalDePontos(personagem.getTotalDePontos() - 10);
			personagem.setInteligenciaQI(personagem.getInteligenciaQI()*1.05);
			personagem.Vantagens.add("Memoria");
		}
		else if(i == POLIGLOTA){
			personagem.setTotalDePontos(personagem.getTotalDePontos() - 10);
			personagem.setDextrezaDZ(personagem.getDextrezaDZ()*1.05);
			personagem.Vantagens.add("Poliglota");
		}
		
	}

	public void colocaDesvantagem(int i, Personagem personagem) {
		if(i == PREGUICA){
			personagem.setTotalDePontos(personagem.getTotalDePontos() - 35);
			personagem.setDextrezaDZ(personagem.getForcaFR()*0.92);
			personagem.Desantagens.add("Preguiça");
		}
		else if(i == MIOPE){
			personagem.setTotalDePontos(personagem.getTotalDePontos() - 40);
			personagem.setDextrezaDZ(personagem.getDextrezaDZ()*0.95);
			personagem.Desantagens.add("Meiope");
		}
		
	}
	

	
	


	public void colocaPericia(int i, Personagem personagem) {
		if(i == DANCA){
			personagem.setDextrezaDZ(personagem.getDextrezaDZ() + 5);
			personagem.Pericia.add("Dança");
		}
		else if(i == CIRURGIA){
			personagem.setDextrezaDZ(personagem.getDextrezaDZ() + 5);
			personagem.Desantagens.add("Cirurgia");
		}	
	}

}