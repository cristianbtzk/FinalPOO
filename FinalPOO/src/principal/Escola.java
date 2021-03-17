package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Escola {
	private String nome;
	private List<Livro> livros = new ArrayList<Livro>();
	private List<Curso> cursos = new ArrayList<Curso>();
	private List<AtividadeExtraCurricular> atividades = new ArrayList<AtividadeExtraCurricular>();
	
	

	public Escola() {}
	
	public Escola(String nome, String nomeCurso, int maxAlunosCurso) {
		setNome(nome);
		Curso curso = new Curso(nomeCurso, maxAlunosCurso);
		cursos.add(curso);
	}
	
	public boolean adicionarLivro(Livro livro) {
		return livros.add(livro);
	}
	
	public boolean adicionarAtividade(String descricao) {
		AtividadeExtraCurricular ativide = new AtividadeExtraCurricular(descricao);
		return atividades.add(ativide);
	}
	
	public void adicionarPessoa(String nomeCurso, Pessoa pessoa) {
		for(Curso curso: cursos) {
			if(curso.getNome().equalsIgnoreCase(nomeCurso)) {
				curso.adicionarPessoa(pessoa);
				System.out.println(pessoa.getNome()+" foi matriculado no curso de "+nomeCurso);
			}
		}
		
	}
	
	public void adicionarAluno(String descricao, Aluno aluno) {
		for(AtividadeExtraCurricular atividade: atividades) {
			if(atividade.getDescricao().equalsIgnoreCase(descricao)) {
				atividade.adicionarAluno(aluno);
				System.out.println(aluno.getNome()+" foi matriculado na atividade "+descricao);
			}
		}
		
	}
	
	public boolean adicionarCursos(String nome, int maxAlunos) {
		Curso curso = new Curso(nome, maxAlunos);
		return cursos.add(curso);
	}
	
	public void mostrarAtividades() {
		for (AtividadeExtraCurricular atividade : atividades) {
			atividade.mostrarParticipantes();
		}
	}
	
	public void divulgarAtividade() {
		for (AtividadeExtraCurricular atividade : atividades) {
			atividade.divulgar();
		}
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Escola [nome=");
		builder.append(nome);
		builder.append("]");
		for (Livro livro : livros) {
			builder.append(livro.toString());
		}
		for (Curso curso : cursos) {
			builder.append(curso.toString());
		}
		return builder.toString();
	}
}
