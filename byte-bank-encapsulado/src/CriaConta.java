
public class CriaConta {

	public static void main(String[] args) {
		Cliente cliente =  new Cliente();
		Conta conta = new Conta(1337,24226);
		
		conta.setTitular(cliente);
		conta.getTitular().setNome("Renan");
		
		
		conta.depositar(200);
		System.out.println(conta.getTitular().getNome());
		System.out.println("Agencia: " + conta.getAgencia() + "," +"Numero conta: " + conta.getNumero());
		System.out.println("Saldo na conta: " + conta.getSaldo());
		Conta conta2 = new Conta(1337,6665);
		Conta conta3 = new Conta(1337,6666);
		
		System.out.println("Total de contas: " + Conta.getTotal());

	}

}
