package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

 //br.com.bytebank.banco.test.TesteContas
public class TesteContas {

		//java.lang.String
	public static void main(String[] args) {

		// Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		try {
			cc.transfere(10.0, cp);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
