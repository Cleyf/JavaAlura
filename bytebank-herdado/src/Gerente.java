// heran�a da classe Funcionario, assina contrato com autenticavel interface
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente(){
		this.autenticador = new AutenticacaoUtil();
	}
	
	// super significa que o atributo e herdado da classe m�e, no caso funcion�rio.
	// super.getBonificacao uma forma de somar o m�todo  da classe herdada que daria 10% de bonifica��o 
	// o salario do gerente que � a bonifica��o total do gerente salario + 10%. Se a bonifica��o mudar
	//eu mudo apenas o metodo
	 public double getBonificacao() {
		 System.out.println("Chamando o m�todo de bonifica��o do gerente");
		return super.getSalario();
	}
	
	 
	 @Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
			
		}

		@Override
		public boolean autentica(int senha){
	        return this.autenticador.autentica(senha);
	    }
	
	
}
