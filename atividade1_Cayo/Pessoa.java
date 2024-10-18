import javax.swing.JOptionPane;

class Pessoa {
	private String nome;
	private int idade;

	public Pessoa() {
		nome = "Jailton";
		idade = 35;
	}

	public Pessoa(String nome) {
		this();
		this.nome = nome;
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return (nome);
	}

	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + nome + ", idade: " + idade, "Pessoa", JOptionPane.INFORMATION_MESSAGE);
	}
}