package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		ContaCorrente cc = new ContaCorrente(12, 448);
		guardador.adicionar(cc);
		ContaCorrente cc1 = new ContaCorrente(12, 5548);
		guardador.adicionar(cc1);
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
