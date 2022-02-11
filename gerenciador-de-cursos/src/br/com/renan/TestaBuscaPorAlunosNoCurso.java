package br.com.renan;

public class TestaBuscaPorAlunosNoCurso {

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
		
		System.out.println("Quem é o aluno com matricula 666?  ");
		Aluno aluno = javaColecoes.buscaMatricula(666);
		System.out.println("Aluno: " + aluno);
	}

}
