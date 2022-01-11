
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public double getSaldo(){
		return this.saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Vlor insuficiente na conta");
			return false;
		}
	}

	public boolean tranfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		} else {
			System.out.println("Valor insuficiente para transferencia");
			return false;
		}
	}

}
