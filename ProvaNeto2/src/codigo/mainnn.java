package codigo;

import java.util.regex.*;

public class mainnn {
	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("(((?<mensagem>^.*?)(?=[#,<]))|((?<=<(?<multimidia>imagem|audio)>)(?<caminho>\\S*)(?=</(imagem|audio)>)|(?<tags>([#])\\w*)))");
		Pattern p = Pattern.compile("(?<ai>^.*?)(?=[<#])");
		String mensagem = ("sdajsndkasd   nasdn <audio>musicas/poderosas.mp3</audio> <imagem>imagens/encontro_vinheta.jpg</imagem> #OLA #AZUL");
		Matcher m = p1.matcher("sdajsndkasd   nasdn <audio>musicas/poderosas.mp3</audio> <imagem>imagens/encontro_vinheta.jpg</imagem> #OLA #AZUL");
		while (m.find()) {
			
			System.out.println("mensagem " + m.group("mensagem"));
			System.out.println("multimidia => " + m.group("multimidia"));
			System.out.println("caminho => " + m.group("caminho"));
			System.out.println("tag => " + m.group("tags"));
			}
	}
}
