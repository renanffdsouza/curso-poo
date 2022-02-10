package br.com.java.renan.io.tet;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaFileWrite2 {

	public static void main(String[] args) throws IOException {
		/*
		 * OutputStream fos = new FileOutputStream("Lorem2.txt"); Writer osw = new
		 * OutputStreamWriter(fos); BufferedWriter bw = new BufferedWriter(osw);
		 */
		//FileWriter fw = new FileWriter("Lorem2.txt");
		//BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem2.txt"));
		//PrintStream ps = new PrintStream("Lorem2.txt");
		
		PrintWriter ps = new PrintWriter("Lorem2.txt");
		ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
		ps.println();
		ps.println();
		ps.println("Renan Fernandes de Souza");
	
		ps.close();

	}

}
