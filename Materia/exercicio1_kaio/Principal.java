class Principal {
	public static void main(String[] args) {
		PessoaFisica cliente1 = new PessoaFisica(135, "Itapua", 1234567, "Jose da Silva");
		PessoaJuridica cliente2 = new PessoaJuridica(209, "Alegre", 987654, "COOP", "IE");
		cliente1.imprimirExtrato();
		cliente2.imprimirExtrato();

		cliente1.depositar(50000);
		cliente1.imprimirExtrato();

		cliente1.transferir(cliente2, 50500);
		cliente1.imprimirExtrato();
		cliente2.imprimirExtrato();
	}
}