import javax.swing.JOptionPane;

class Terceirizado extends Funcionario {
	private String empresaContratada;

	public Terceirizado(String nome, int idade, float salario, String dataContratacao, String empresaContratada) {
		super(nome, idade, salario, dataContratacao);
		this.empresaContratada = empresaContratada;
	}

	public Terceirizado(String nome, float salario, String empresaContratada) {
		super(nome, salario);
		this.empresaContratada = empresaContratada;
	}

	@Override
	public float calcularBonus() {
		return (getSalario() * 0.05f);
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		JOptionPane.showMessageDialog(null, "Empresa Contratada: " + empresaContratada, "Terceirizado", JOptionPane.INFORMATION_MESSAGE);
	}
}