package principal;


public class Aluno extends Pessoa{
private String matricula;
	
	public Aluno() {}

	public Aluno(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public void estudar(Livro livro) {
		System.out.println(super.getNome()+ " acabou de estudar o livro "+livro.getTitulo());
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
