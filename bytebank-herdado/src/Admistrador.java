
public class Admistrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Admistrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
