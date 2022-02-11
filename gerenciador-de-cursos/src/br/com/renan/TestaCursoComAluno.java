package br.com.renan;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Duda", 124);
		Aluno a2 = new Aluno("Pedro", 666);
		Aluno a3 = new Aluno("Carlos", 566);
		
		javaColecoes.matriculaAluno(a1);
		javaColecoes.matriculaAluno(a2);
		javaColecoes.matriculaAluno(a3);
		// usando Iterator
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
//		
//		for (Aluno aluno : alunos) {
//			System.out.println(aluno);
//		}
//		System.out.println("Alunos matriculados:");
//		javaColecoes.getAlunos().forEach(a ->{
//			System.out.println(a);
//		});
//		
//		System.out.println("O Aluno " + a1 + " está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
	}

}
