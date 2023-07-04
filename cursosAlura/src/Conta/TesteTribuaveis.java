package Conta;

public class TesteTribuaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadordeImposto calc = new CalculadordeImposto();

		calc.registra(cc);
		calc.registra(seguro);
		
		
		System.out.println(calc.getTotalImposto());
	}

}
