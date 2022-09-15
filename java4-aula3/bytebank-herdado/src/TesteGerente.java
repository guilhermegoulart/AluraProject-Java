
public class TesteGerente {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		c.setNome("Guilherme");
		c.setSenha(1234);

		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("235568413");
		g1.setSalario(5000.0);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		boolean autentica = c.autentica(111);

		System.out.println(autenticou);

		System.out.println(c.getNome() + " é um gerente?");
		System.out.println(autentica);

		System.out.println(g1.getBonificacao());

	}

}
