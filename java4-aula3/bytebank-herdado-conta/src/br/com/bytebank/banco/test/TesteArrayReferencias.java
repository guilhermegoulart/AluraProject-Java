package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		// int[] idades = new int[5]
		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;

		System.out.println(referencias[0]);

		ContaPoupanca cp = new ContaPoupanca(16, 32);
		referencias[1] = cp;

//		ContaCorrente cc2 = new ContaCorrente(15, 36);
//		contas[1] = cc2;

		// System.out.println(cc2.getNumero());
		Object referenciaGenerica = referencias[1];

		System.out.println(((Conta) referenciaGenerica).getNumero());

		ContaCorrente ref = (ContaCorrente) referencias[0];// type cast
		System.out.println(cp.getAgencia());
		System.out.println(ref.getAgencia());
	}

}
