class Principal {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario(1, "Joao", 30000.0f);
		Funcionario funcionario2 = new Funcionario(2, "Maria", 60000.0f);
		Funcionario funcionario3 = new Funcionario(3, "Jose", 1000.0f);

		Departamento departamento = new Departamento();
		departamento.adicionar(funcionario1);
		departamento.adicionar(funcionario2);
		departamento.adicionar(funcionario3);
		departamento.listarFuncionarios();
		departamento.remover(funcionario1);
		departamento.remover(funcionario3);
		departamento.listarFuncionarios();
	}
}