package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(01, 222);
		cc.depositar(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc =  new CalculadorDeImposto();
		calc.resgistra(cc);
		calc.resgistra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
