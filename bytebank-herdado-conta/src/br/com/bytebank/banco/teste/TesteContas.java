package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(01, 123);
		cc.depositar(1000);

		ContaPoupanca cp = new ContaPoupanca(02, 222);
		cp.depositar(2500);

		cc.tranfere(150, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
