package br.com.java.renan.io.tet;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWrite {

	public static void main(String[] args) throws IOException {
		/*
		 * OutputStream fos = new FileOutputStream("Lorem2.txt"); Writer osw = new
		 * OutputStreamWriter(fos); BufferedWriter bw = new BufferedWriter(osw);
		 */
		//FileWriter fw = new FileWriter("Lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem2.txt"));
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
		bw.newLine();
		bw.newLine();
		bw.write("Renan Fernandes de Souza");
		bw.close();

	}

}
