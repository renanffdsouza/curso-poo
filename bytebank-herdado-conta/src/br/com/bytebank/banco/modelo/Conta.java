package br.com.bytebank.banco.modelo;
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia, int numero ) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Criando uma nova conta");
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		if(novaAgencia <= 0) {
			System.out.println("não pode valores menores ou igual a 0");
			return;
		}
		this.agencia = novaAgencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if(novoNumero <= 0) {
			System.out.println("não pode valores menores ou igual a 0");
			return;
		}
		this.numero = novoNumero;
	}
	
	public static int getTotal() {
		return total;
	}
	

	public  abstract void depositar(double valor);
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor " + valor);
			
		} 
		this.saldo -= valor;
	}

	public boolean tranfere(double valor, Conta destino)throws SaldoInsuficienteException {
			this.saca(valor);
			destino.depositar(valor);
			return true;
		} 
	}


