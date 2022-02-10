package br.com.bytebank.banco.modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia,numero);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Poupanção, " + super.toString();
	}
}
