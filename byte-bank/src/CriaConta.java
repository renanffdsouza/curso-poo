
public class CriaConta {

	public static void main(String[] args) {
		/*
		 * Conta primeiraConta = new Conta(); primeiraConta.saldo = 200.0;
		 * primeiraConta.saldo += 100;
		 * 
		 * Conta segundaConta = new Conta(); segundaConta.saldo = 50;
		 * System.out.println("Primeira conta: " + primeiraConta.saldo);
		 * System.out.println("Segunda conta: " + segundaConta.saldo);
		 * 
		 * System.out.println(primeiraConta.agencia);
		 * System.out.println(primeiraConta.numero);
		 * 
		 * Conta contaRenan = new Conta(); Conta contaDuda = new Conta();
		 * contaDuda.depositar(1000); contaRenan.depositar(100.00);
		 * System.out.println("Valor na conta Renan: " + contaRenan.saldo);
		 * contaRenan.saca(100); System.out.println("Valor na conta Renan: " +
		 * contaRenan.saldo); contaDuda.tranfere(250, contaRenan);
		 * System.out.println("Valor na conta Renan: " + contaRenan.saldo);
		 * System.out.println("Valor na conta Duda: " + contaDuda.saldo);
		 * contaDuda.tranfere(1000, contaRenan);
		 * System.out.println("Valor na conta Duda: " + contaDuda.saldo);
		 */

		Cliente renan = new Cliente();
		renan.nome = "Renan";
		renan.cpf = "010.230.309-69";
		renan.profissao = "Estudante";

		Conta contaRenan = new Conta();
		contaRenan.depositar(1000);
		contaRenan.titular = renan;
		System.out.println(contaRenan.titular.nome + "," + contaRenan.getSaldo());

	}

}
