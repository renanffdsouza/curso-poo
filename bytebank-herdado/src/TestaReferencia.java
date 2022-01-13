
public class TestaReferencia {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Pedro");
		gerente.setSalario(2000);
		
		Funcionario funcionario = new Gerente();
		funcionario.setSalario(2500);
		
		EditorVideo editor = new EditorVideo();
		editor.setSalario(3000);
		
		Designer designer =  new Designer();
		designer.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(editor);
		controle.registra(designer);
		
		System.out.println(controle.getBonificacao());

	}

}
