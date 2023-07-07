package herdadoCconta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void saca(double valor) {
		double valorASacar = valor + 0.2;	
		super.saca(valorASacar);
	}

}
