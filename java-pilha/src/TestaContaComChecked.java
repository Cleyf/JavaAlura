
public class TestaContaComChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch(MinhaExcessao ex) {
			System.out.println("tratamento .....");
		}
		
	}
	
}
