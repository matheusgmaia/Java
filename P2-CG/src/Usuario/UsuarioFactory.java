package Usuario;

public class UsuarioFactory {
	private UsuarioFactory(){}
	
	public static UsuarioFactory getInstance(){
		return new UsuarioFactory();
	}

	public  void downgrade(Usuario usuario){
		usuario.setJogador(new Noob());
	}
	
	public void upgrade(Usuario usuario){
		usuario.setJogador(new Veterano());
	}
}
