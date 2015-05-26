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
		NOOB(10),VETERANO(20);
		public int valorDoDesconto;
		TipoDeUsuario(int desconto){
			valorDoDesconto = desconto;
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
