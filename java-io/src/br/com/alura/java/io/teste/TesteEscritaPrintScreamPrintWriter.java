package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintScreamPrintWriter {
	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		// PrintStream ps = new PrintStream(new File("lorem2.txt"));
		 PrintWriter ps = new PrintWriter("lorem2.txt");

		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("asasa");
		
		ps.close();
		
		System.out.println();
	}

}
