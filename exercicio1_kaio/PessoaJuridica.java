class PessoaJuridica extends Cliente {
	private int cnpj;
	private String razaoSocial;
	private String naturezaJuridica;

	public PessoaJuridica(int numeroConta, String agencia, int cnpj, String razaoSocial, String naturezaJuridica) {
		super(numeroConta, agencia, 5000);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.naturezaJuridica = naturezaJuridica;
	}

	public int getCnpj() {
		return (cnpj);
	}

	public String getRazaoSocial() {
		return (razaoSocial);
	}

	public String getNaturezaJuridica() {
		return (naturezaJuridica);
	}

	public void setNaturezaJuridica(String naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Razao Social: " + razaoSocial);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Natureza Juridica: " + naturezaJuridica);
		imprimirConta();
	}
}