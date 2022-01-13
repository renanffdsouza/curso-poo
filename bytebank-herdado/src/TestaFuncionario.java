
public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente renan = new Gerente();
		renan.setNome("Renan Fernandes");
		renan.setCpf("001.006.845.12");
		renan.setSalario(1500);
		System.out.println(renan.getNome());
		System.out.println(renan.getBonificacao());

	}

}
