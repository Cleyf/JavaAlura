// herança da classe Funcionario, assina contrato com autenticavel interface
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente(){
		this.autenticador = new AutenticacaoUtil();
	}
	
	// super significa que o atributo e herdado da classe mãe, no caso funcionário.
	// super.getBonificacao uma forma de somar o método  da classe herdada que daria 10% de bonificação 
	// o salario do gerente que é a bonificação total do gerente salario + 10%. Se a bonificação mudar
	//eu mudo apenas o metodo
	 public double getBonificacao() {
		 System.out.println("Chamando o método de bonificação do gerente");
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
