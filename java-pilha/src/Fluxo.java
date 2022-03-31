
public class Fluxo {
	  
	public static void main(String[] args) {
	      System.out.println("Ini do main");
	      try {
	    	  metodo1();  
	      } catch(Exception ex) {                // captura o erro no caso com o nome
		    	String msg = ex.getMessage();
	    	  	System.out.println("Exception " + msg);  // faz o tratamento para o codigo contin
	    	  	ex.printStackTrace();  // imprime o trajeto do erro
		    } 
	      System.out.println("Fim do main");
	    }

	private static void metodo1() throws MinhaExcessao{
	     System.out.println("Ini do metodo1");
	     metodo2();
	     System.out.println("Fim do metodo1");
	    }

	private static void metodo2() throws MinhaExcessao {
	    System.out.println("Ini do metodo2");
	    
	    throw new MinhaExcessao("deu muito errado"); // mesmo código.
	    
	    //	    ArithmeticException ex = new ArithmeticException("deu errado"); aqui o codigo feito completo
//	    throw ex;
	    
	    //System.out.println("Fim do metodo2");
	    }
}
