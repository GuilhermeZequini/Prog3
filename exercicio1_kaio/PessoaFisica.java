class PessoaFisica extends Cliente {
	private int cpf;
	private String nome;

	public PessoaFisica(int numeroConta, String agencia, int cpf, String nome) {
		super(numeroConta, agencia, 1000);
		this.cpf = cpf;
		this.nome = nome;
	}

	public int getCpf() {
		return (cpf);
	}

	public String getNome() {
		return (nome);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		imprimirConta();
	}
}