package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		int a = 3; //int e um primitivo e n�o class, come�a com letra minuscula
		String name = "Alura"; // String objeto letra maiuscula
		//String outro = new String("Alura"); mesma forma, s� que em m� pratica.
		
		String outra = name.replace("A", "a");
		System.out.println(outra);
		System.out.println(name);
		//name.toLowerCase();
		
		String novo = name.toLowerCase(); //tamb�m teste toUpperCase()

		System.out.println(novo);
		
		char c = name.charAt(3); //char i
		System.out.println(c);

		int pos = name.indexOf("rio");
		System.out.println(pos);

		String sub = name.substring(1);
		System.out.println(sub);
		
		for(int i = 0; i < name.length(); i++) {
		    System.out.println(name.charAt(i));
		} 
	}

}
