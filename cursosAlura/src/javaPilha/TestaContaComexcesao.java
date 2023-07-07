package javaPilha;

public class TestaContaComexcesao {

	public static void main(String[] args) {
			
		try {
			Conta c = new Conta();
			c.deposita();
		}catch(MinhaExcecao ex) {
			System.out.println("Tratamento.....");
		}
		

	}

}
