
public class FluxoComErro {
	  
	public static void main(String[] args) {
	      System.out.println("Ini do main");
	      try {
	    	  metodo1();  
	      } catch(ArithmeticException | NullPointerException ex) {                // captura o erro no caso com o nome
		    	String msg = ex.getMessage();
	    	  	System.out.println("Exception " + msg);  // faz o tratamento para o codigo contin
	    	  	ex.printStackTrace();  // imprime o trajeto do erro
		    } 
	      System.out.println("Fim do main");
	    }

	private static void metodo1() {
	     System.out.println("Ini do metodo1");
	     metodo2();
	     System.out.println("Fim do metodo1");
	    }

	private static void metodo2() {
	    System.out.println("chamando metodo 2");
		metodo2();
		System.out.println("fim metodo 2");

	    }
}
