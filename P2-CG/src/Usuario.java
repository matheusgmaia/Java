import java.util.ArrayList;


public class Usuario {
	
	//ATRIBUTOS
	private String nome;
	private String login;
	private double dinheiroQuePossui;
	private TipoDeUsuario tipoDeUsuario;
	private int desconto = tipoDeUsuario.valorDoDesconto;
	private ArrayList<Jogo> jogosComprados = new ArrayList<Jogo>();
	
	
	//TIPOS DE USUARIO
	public enum TipoDeUsuario{
		NOOB(10, "Noob"),VETERANO(20, "Veterano");
		public int valorDoDesconto;
		public String tipoDeUsuario;
		TipoDeUsuario(int desconto, String tipo){
			valorDoDesconto = desconto;
			tipoDeUsuario = tipo;
		} 
	}

	public Usuario(String nome2, String login2, double grana) {
		this.nome = nome2;
		this.login = login2;
		this.dinheiroQuePossui = grana;
		
	}

	public void comprarJogo(
			){}
	
}
