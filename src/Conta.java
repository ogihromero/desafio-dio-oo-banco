
public abstract class Conta implements IConta{
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

}
