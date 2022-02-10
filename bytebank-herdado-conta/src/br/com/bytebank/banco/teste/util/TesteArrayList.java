package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		LinkedList<Conta> lista = new LinkedList<Conta>();
		ContaCorrente cc = new ContaCorrente(12, 448);
		ContaCorrente cc1 = new ContaCorrente(12, 5548);
		lista.add(cc);
		lista.add(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(12, 5548);
		
		boolean existe = lista.contains(cc2);
		System.out.println("Já existe essa conta? " + existe);
		
		for (Conta oRef : lista) {
			System.out.println(oRef);
		}

	}

}
