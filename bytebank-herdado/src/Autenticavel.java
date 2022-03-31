
// Contrato autenticavel
//quem assina precisa implementar
//metodo setSenha e autentica
public abstract interface Autenticavel {

        public abstract void setSenha(int senha);
        
        public abstract boolean autentica(int senha) ;
}