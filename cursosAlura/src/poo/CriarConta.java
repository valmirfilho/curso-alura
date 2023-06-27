package poo;

public class CriarConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
		conta.deposita(50.0);
		System.out.println(conta.saldo);
		conta.saca(40.0);
		System.out.println(conta.saldo);
		conta.saca(100.0);
	}

}
