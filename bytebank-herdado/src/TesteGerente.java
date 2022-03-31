
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Felipe Carvalho");
		g1.setCpf("225566232-7");
		g1.setSalario(10500.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
