package br.com.renan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Renan Fernandes");
		alunos.add("Duda");
		alunos.add("Sergio");
		alunos.add("Mauricio");
		alunos.add("Nico");
		
		boolean renanestaMatriculado = alunos.contains("Renan Fernandes");
		System.out.println(renanestaMatriculado);
		
		System.out.println(alunos.size());
		
		System.out.println(alunos);
		
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}

}
