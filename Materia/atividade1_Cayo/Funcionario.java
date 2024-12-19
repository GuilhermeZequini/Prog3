import javax.swing.JOptionPane;

class Funcionario extends Pessoa {
	private float salario;
	private String dataContratacao;

	public Funcionario(String nome, float salario) {
		super();
		this.salario = salario;
		this.dataContratacao = "17/10/2024";
	}	

	public Funcionario(String nome, int idade, float salario, String dataContratacao) {
		super(nome, idade);
		this.salario = salario;
		this.dataContratacao = dataContratacao;
	}

	protected float getSalario() {
		return (salario);
	}

	public float calcularBonus() {
		return (salario * 0.1f);
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		JOptionPane.showMessageDialog(null, "Salario: " + salario + "\nData de Contratacao: " + dataContratacao, "Funcionario", JOptionPane.INFORMATION_MESSAGE);
	}
}