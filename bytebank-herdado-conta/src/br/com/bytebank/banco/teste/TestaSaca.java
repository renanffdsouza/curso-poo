package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaSaca {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(001, 123);
		cc.depositar(200);
		try {
			cc.saca(210);
		}catch (SaldoInsuficienteException e) {
			System.out.println("Exeção: " + e.getMessage());
		}
		
		System.out.println(cc.getSaldo());

	}

}
