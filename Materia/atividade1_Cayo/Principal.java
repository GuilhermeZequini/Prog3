class Principal {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Joao", 10000.0f);
		Funcionario funcionario2 = new Funcionario("Maria", 30, 15000.0f, "17/10/2024");
		Terceirizado terceirizado1 = new Terceirizado("Paulo", 5000.0f, "Google");
		Terceirizado terceirizado2 = new Terceirizado("Joana", 29, 20000.0f, "17/10/2023", "Microsoft");
		Equipe equipe1 = new Equipe("Delta", funcionario2);
		try {
			equipe1.adicionarMembro(funcionario1);
			equipe1.adicionarMembro(funcionario2);
			equipe1.adicionarMembro(terceirizado1);
			equipe1.adicionarMembro(terceirizado2);
			equipe1.exibirMembros();
			equipe1.exibirBonus();
		}
		catch (NullPointerException excecao) {
			System.out.println(excecao);
		}
	}
}