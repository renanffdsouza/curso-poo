package br.com.bytebank.banco.modelo;
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	}
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorSacar = valor + 0.2;
		super.saca(valorSacar) ;
	}
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.1;
	}
}
