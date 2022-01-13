
public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Duda");
		gerente.setCpf("000.000.000.00");
		gerente.setSalario(3500);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		//boolean autentica = gerente.autentica(1000);
		//System.out.println(autentica);
		
		gerente.setSenha(123);

		boolean autentica2 = gerente.autentica(123);
		System.out.println(autentica2);
		System.out.println(gerente.getBonificacao());
		

	}

}
