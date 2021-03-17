package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class Main {
	public static void main(String[] args) throws IOException {
		Escola escola = new Escola("IFC", "Ciência da Computação", 50);
		
		Livro livro1 = new Livro("Informática para iniciantes", "John Doe");
		Livro livro2 = new Livro("Programação", "John Tre");
		escola.adicionarLivro(livro1);
		escola.adicionarLivro(livro2);
		
		// Adicionar Atividades extra curriculares e divulgar
		escola.adicionarAtividade("Natação");
		escola.adicionarAtividade("Futebol");
		escola.divulgarAtividade();
		
		
		escola.adicionarCursos("Agropecuária", 100);

		Aluno aluno1 = new Aluno("Pedro", "123456");
		Aluno aluno2 = new Aluno("Márcia", "321546");
		aluno1.estudar(livro1);
		Professor professor1 = new Professor("Daniel", "Algoritmos");
		Professor professor2 = new Professor("Rodrigo", "POO");


		escola.adicionarPessoa("Ciência da Computação", aluno1);
		escola.adicionarPessoa("Ciência da Computação", professor1);
		
		escola.adicionarAluno("Natação", aluno1);
		escola.adicionarAluno("Futebol", aluno2);
		
		escola.adicionarPessoa("Agropecuária", aluno2);
		
		// Mostra participantes das atividades extra curriculares
		escola.mostrarAtividades();

		System.out.println(escola.toString());
		
		
		
		///////// PERSISTÊNCIA EM CSV
		
		List<Aluno> alunosCSV = new ArrayList<Aluno>();
		FileWriter arq = new FileWriter("escola.csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.printf("%s;%s\n", aluno1.getNome(), aluno1.getMatricula());
		gravarArq.printf("%s;%s\n", aluno2.getNome(), aluno2.getMatricula());
		arq.close();
		
		try {
			FileReader arq1 = new FileReader("escola.csv");
			BufferedReader lerArq = new BufferedReader(arq1);
			String linha = lerArq.readLine();
			while(linha != null) {
				String[] leitura = linha.split(";");
				
				Aluno a = new Aluno(leitura[0], leitura[1]);
				
				alunosCSV.add(a);
				linha = lerArq.readLine();
			}
			arq1.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n\n####### MOSTRAR ALUNOS ARMAZENADOS EM CSV ###");
		for (Aluno a : alunosCSV) {
			System.out.println(a.toString());
		}
		
		
		
	}
}
