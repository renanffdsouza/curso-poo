
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero ) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma nova conta");
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		if(novaAgencia <= 0) {
			System.out.println("n?o pode valores menores ou igual a 0");
			return;
		}
		this.agencia = novaAgencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if(novoNumero <= 0) {
			System.out.println("n?o pode valores menores ou igual a 0");
			return;
		}
		this.numero = novoNumero;
	}
	
	public static int getTotal() {
		return total;
	}
	

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
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
