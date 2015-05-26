/* 114210417 - Matheus Gomes Maia: LAB 4 - Turma 1 */
package lab04;

public class Musica {
	private String nome;
	private int duracao;
	private String tipo;

	public Musica(String string, int i, String string2) throws Exception {
		if(string.equals("")){
			throw new Exception("Titulo da musica nao pode ser vazio.");			
		}
		if(i < 0){
			throw new Exception("Duracao da musica nao pode ser negativa.");			
		}
		if(string2.equals("")){
			throw new Exception("Genero da musica nao pode ser vazio.");			
		}
		
		
		this.setNome(string);
		this.setDuracao(i);
		this.setTipo(string2);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracao;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		if (duracao != other.duracao)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getDuracao() {
		return duracao;
	}



	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




}
