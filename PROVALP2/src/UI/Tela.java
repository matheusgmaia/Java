package UI;

import Core.Personagem;

public class Tela {

	public void exibeMenuPrincipal() {
		System.out.println("Bem Vindo ao Fallout4, escolha uma opção:"
				+ "\n 1. Criar Personagem"
				+ "\n 2. Ver Personagens"
				+ "\n 3. Sair");
	}

	public int exibeMenuDeAtributos(int pontosRestantes) {
		System.out.println("Vamos colocar atributos ao personagem!"
				+ "\n 1. Mudar Força"
				+ "\n 2. Mudar Dextreza"
				+ "\n 3. Mudar Inteligencia"
				+ "\n 4. Mudar Inteligencia"
				+ "\n 5. Exibir Atributos Atuais"
				+ "\n 6. Feito?");
		return 0;
	}

	public void menuDoPersonagem(Object object) {
		System.out.println("Vamos colocar atributos ao personagem!"
				+ "\n 1. Mudar Força"
				+ "\n 2. Mudar Dextreza"
				+ "\n 3. Mudar Inteligencia"
				+ "\n 4. Mudar Inteligencia"
				+ "\n 5. Exibir Atributos Atuais"
				+ "\n 6. Feito?");
		
	}

	public void menuDoPersonagem(String nome) {
		System.out.println("Vamos manipular" + nome +"!"
				+ "\n 1. Mudar Atributos"
				+ "\n 2. Mudar Vantagens"
				+ "\n 3. Mudar Desvantagens"
				+ "\n 4. Mudar Pericias"
				+ "\n 5. Exibir resumo geral"
				+ "\n 6. Feito?"
				+ "\n OBS: Seu personagem só será criado após ter tudo que é necessário");
		
	}


	public void personagemAdicionado(Personagem personagem) {
		System.out.println("Personagem criado com sucesso!"
				+ "\n Nome: " + personagem.getNome()
				+"\n Altura: " + personagem.getAltura()
				+"\n Idade: " + personagem.getIdade()
				+"\n Total De Pontos: " + personagem.getTotalDePontos());
		
	}

}
