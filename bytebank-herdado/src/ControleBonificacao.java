
public class ControleBonificacao extends Funcionario {
	private double somaBonificacao;

	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.somaBonificacao += bonificacao;
	}

	public double getBonificacao() {
		return somaBonificacao;
	}
}
