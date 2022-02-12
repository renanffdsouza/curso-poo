package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desenpenho) {
		if(desenpenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal(0.03));
			funcionario.reajustarSalario(reajuste);
		}
		
	}

}
