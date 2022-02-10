package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		ContaCorrente cc = new ContaCorrente(12, 448);
		ContaCorrente cc1 = new ContaCorrente(12, 5548);
		lista.add(cc);
		lista.add(cc1);

		System.out.println(lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		ContaCorrente cc2 = new ContaCorrente(12, 111);
		ContaCorrente cc3 = new ContaCorrente(12, 666);
		lista.add(cc2);
		lista.add(cc3);
		System.out.println("Tamanho: " + lista.size());

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("-----------");
		for (Conta oRef : lista) {
			System.out.println(oRef);
		}

	}

}
