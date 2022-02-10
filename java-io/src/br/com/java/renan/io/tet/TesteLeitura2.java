package br.com.java.renan.io.tet;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String conta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
		
			String stringFormatada = String.format(new Locale("pt","BR"), "%s- %04d-%08d, %s: %8.2f", conta,agencia,numero,titular,saldo);
			System.out.println(stringFormatada);
			linhaScanner.close();
			
			//String[] valores = linha.split(",");
			//System.out.println(Arrays.toString(valores)); 
			
			
		}
		scanner.close();

	}
}
