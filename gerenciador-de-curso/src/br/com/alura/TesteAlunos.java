package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {
	public static void main(String[] args) {	
		Collection<String> alunos = new HashSet<>();
		 alunos.add("Rodrigo Turini");
	     alunos.add("Alberto Souza");
	     alunos.add("Nico Steppat");
	     alunos.add("Sergio Lopes");
	     alunos.add("Renan Saggio");
	     alunos.add("Mauricio Aniche");

	     for (String aluno : alunos) {
	         System.out.println(aluno);
	     }
	     
	     alunos.forEach(aluno -> {System.out.println(aluno);
	     });

	     System.out.println(alunos);
	     
	     Collections.sort(alunos);
	     
	     List<String> alunosEmLista = new ArrayList<String>(alunos);
	}

}
