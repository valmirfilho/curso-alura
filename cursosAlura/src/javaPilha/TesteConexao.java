package javaPilha;

public class TesteConexao {

	public static void main(String[] args) {
		
		
	
		try {
			Conexao con = new Conexao();
			con.leDados();
			con.fecha();
		}catch (IllegalStateException e) {
			System.out.println("Deu erro na conexão");		
		}finally {
			con.fecha();
		}

	}

}
