package br.com.renan;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",20));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		System.out.println(javaColecoes.getAulas());

	}

}
