package Core;

import java.util.ArrayList;

import UI.Tela;

public class Personagem {

	private static final int PONTOSDEFAULT = 600;

	// CARACTERISTICAS
	private String nomeDePersonagem;
	private double alturaDePersonagem;
	private int idadeDePersonagem;
	private int totalDePontos;

	// ATRIBUTOS
	private double forcaFR;
	private double dextrezaDZ;
	private double inteligenciaQI;
	private double vitalidadeVT;
	
	//VANTAGENS, PERICIAS, DESVANTAGENS
	ArrayList<String> Vantagens = new ArrayList<String>();
	ArrayList<String> Desantagens = new ArrayList<String>();
	ArrayList<String> Pericia = new ArrayList<String>();
	
	
	private Tela tela = new Tela();

	public Personagem(String nomeDePersonagem, Double alturaDePersonagem,
			int idadeDePersonagem) {
		this.nomeDePersonagem = nomeDePersonagem;
		this.alturaDePersonagem = alturaDePersonagem;
		this.idadeDePersonagem = idadeDePersonagem;
		this.totalDePontos = PONTOSDEFAULT;
		tela.personagemAdicionado(this);

	}

	public double getForcaFR() {
		return forcaFR;
	}

	public void setForcaFR(double forcaFR) {
		if (Math.pow(forcaFR, 2) < this.totalDePontos) {
			this.forcaFR = forcaFR;
			this.totalDePontos -= Math.pow(forcaFR, 2);
		} else {
			System.out.println("Voce nao tem pontos suficientes");
		}
	}

	public double getDextrezaDZ() {
		return dextrezaDZ;
	}

	public void setDextrezaDZ(double dextrezaDZ) {
		if (Math.pow(dextrezaDZ, 2) < this.totalDePontos) {
			this.dextrezaDZ = dextrezaDZ;
			this.totalDePontos -= Math.pow(dextrezaDZ, 2);
		} else {
			System.out.println("Voce nao tem pontos suficientes");
		}
	}

	public double getInteligenciaQI() {
		return inteligenciaQI;
	}

	public void setInteligenciaQI(double inteligenciaQI) {
		if (Math.pow(inteligenciaQI, 2) < this.totalDePontos) {
			this.inteligenciaQI = inteligenciaQI;
			this.totalDePontos -= Math.pow(inteligenciaQI, 2);
		} else {
			System.out.println("Voce nao tem pontos suficientes");
		}
	}

	public double getVitalidadeVT() {
		return vitalidadeVT;
	}

	public void setVitalidadeVT(double vitalidadeVT) {
		if (Math.pow(vitalidadeVT, 2) < this.totalDePontos) {
			this.vitalidadeVT = vitalidadeVT;
			this.totalDePontos -= Math.pow(vitalidadeVT, 2);
		} else {
			System.out.println("Voce nao tem pontos suficientes");
		}
	}

	public int getTotalDePontos() {
		return totalDePontos;
	}

	public void setTotalDePontos(int totalDePontos) {
		this.totalDePontos = totalDePontos;
	}

	public void resumirAtributos() {
		System.out.println("Seu personagem " + this.nomeDePersonagem + " tem de atributos: "
				+ "\nForca:" + this.getForcaFR() + "\nDextreza:"
				+ this.getDextrezaDZ() + "\nInteligencia:"
				+ this.getInteligenciaQI() + "\nVitalidade:"
				+ this.getVitalidadeVT());

	}

	public void resumir() {
		System.out.println(""
				+ "\nNome:" + this.nomeDePersonagem
				+ "\nAltura:" + this.alturaDePersonagem
				+ "\nFR:" + this.forcaFR
				+ "\nDX:" + this.dextrezaDZ
				+ "\nQI" + this.inteligenciaQI
				+ "\nVT:" + this.vitalidadeVT
				+ "\n\nVantagens:");
		
				for (String vantagem: Vantagens){
					System.out.println(" " + vantagem);
				}
				
				System.out.println("\n\nDesvantagens:");
				for (String desvantagem: Desantagens){
					System.out.println(" " + desvantagem);
				}
				
				
				System.out.println("\n\nTotal de Pontos restantes: " + this.totalDePontos);
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return this.nomeDePersonagem;
	}

	public double getAltura() {
		// TODO Auto-generated method stub
		return this.alturaDePersonagem;
	}

	public int getIdade() {
		// TODO Auto-generated method stub
		return this.idadeDePersonagem;
	}

	}


