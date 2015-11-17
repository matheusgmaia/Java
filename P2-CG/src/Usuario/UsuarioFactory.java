package Usuario;

public class UsuarioFactory {
    /* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

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
