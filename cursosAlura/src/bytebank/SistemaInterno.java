package bytebank;

 
public class SistemaInterno {
	private int senha = 2222;
	public void autentica(Autenticavel f) {
		boolean autenticou = f.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no Sistema");		
		}else {
			System.out.println("Não Pode entrar no Sistema");
		}
	}
}
