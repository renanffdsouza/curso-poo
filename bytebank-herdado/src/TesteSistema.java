
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(123);
		Admistrador administrador = new Admistrador();
		administrador.setSenha(321);
		Cliente cliente = new Cliente();
		cliente.setSenha(123);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);
		sistemaInterno.autentica(cliente);
	}

}
