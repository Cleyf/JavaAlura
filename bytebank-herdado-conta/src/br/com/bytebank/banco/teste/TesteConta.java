package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteConta {
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaEspecial ce = new ContaEspecial(333, 333);
		ce.deposita(500);
		System.out.println(ce.getSaldo());
		
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		// full qualified name FQN
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo Conta Corrente" + cc.getSaldo());
		System.out.println("Saldo Conta Poupanca" + cp.getSaldo());
		
	}
}
