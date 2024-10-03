abstract class Cliente {
	private int numeroConta;
	private String agencia;
	private float saldo;
	private float limite;

	public Cliente(int numeroConta, String agencia, float limite) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.limite = limite;
		saldo = 0.0f;
	}

	public int getNumeroConta() {
		return (numeroConta);
	}

	public String getAgencia() {
		return (agencia);
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return (saldo);
	}

	public float getLimite() {
		return (limite);
	}

	public void setLimite(float valor) {
		limite = valor;
	}

	public float sacar(float valor) {
		if (saldo + limite >= valor) {
			saldo -= valor;
			return (valor);
		}
		return (0.0f);
	}

	public void depositar(float valor) {
		saldo += valor;
	}

	public boolean transferir(Cliente cliente, float valor) {
		if (sacar(valor) > 0.0f) {
			cliente.depositar(valor);
			return (true);
		}
		return (false);
	}

	abstract public void imprimirExtrato();
}