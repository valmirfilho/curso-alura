package herdadoCconta;

public class TesteSaca2 {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		
		conta.deposita(200);
		conta.saca(200);
		
		System.out.println(conta.getSaldo());
	}
}
