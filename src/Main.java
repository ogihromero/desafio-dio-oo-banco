
public class Main {
	public static void main(String[] args) {

		Cliente adriano = new Cliente();
		adriano.setNome("Adriano");
		Conta cc = new ContaCorrente(adriano);
		Conta cp = new ContaPoupanca(adriano);

		cc.depositar(100);
		cc.transferir(100, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
