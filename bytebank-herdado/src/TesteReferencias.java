
public class TesteReferencias {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Roberto");
		g1.setSalario(7000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(4000);
		
		Designer d = new Designer();
		d.setSalario(3000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
		
	}
}
