package principal;

import java.util.ArrayList;
import java.util.List;

public class AtividadeExtraCurricular implements Operacoes{
	private String descricao;
	final int Participantes = 15;
	private List<Aluno> alunos = new ArrayList<Aluno>();

	public AtividadeExtraCurricular(String descricao) {
		setDescricao(descricao);
	}
	
	public boolean adicionarAluno(Aluno aluno) {
		return alunos.add(aluno);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length() > 0)
			this.descricao = descricao;
	}

	public int getParticipantes() {
		return Participantes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AtividadeExtraCurricular [descricao=");
		builder.append(descricao);
		builder.append(", Participantes=");
		builder.append(Participantes);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void divulgar() {
		System.out.println("Venha fazer parte do grupo de "+this.descricao+". Inscreva-se.");
		
	}

	@Override
	public void mostrarParticipantes() {
		System.out.println("Participantes da atividade "+this.descricao);
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
		
	}
	
	
	
}
