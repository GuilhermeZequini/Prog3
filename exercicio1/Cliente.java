class Cliente {
    private int numeroConta;
    private String agencia;
    private float saldo;
    private float limite;

    Cliente(int numeroConta, String agencia, float limite){
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
			saldo = saldo - valor;
			return (valor);
		}
		return (0.0f);
	}

	public void depositar(float valor) {
		saldo = saldo + valor;
	}

	public boolean transferir(Cliente cliente, float valor) {
		if (sacar(valor) > 0.0f) {
			cliente.depositar(valor);
			return (true);
		}
		return (false);
	}

    public void imprimirExtrato(){
        System.out.println("Agencia: " + agencia);
	    System.out.println("Numero da Conta: " + numeroConta);
		System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println();
    }
}










