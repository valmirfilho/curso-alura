package polimorfismo;

public class testeReferencia {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("sara");
		f1.setSalario(5000.0);
		
		Gerente g1 = new Gerente();
		g1.setNome("valmir");
		g1.setSalario(5000.0);
		
		
		EditorVideo ed = new EditorVideo();
		ed.setNome("joao");
		ed.setSalario(5000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ed);
		
		System.out.println(controle.getSoma());

	}

}
