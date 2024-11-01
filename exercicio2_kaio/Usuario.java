import javax.swing.JOptionPane;
import java.time.LocalDate;

class Usuario extends Pessoa {
	private int id;
	private LocalDate dataCadastro;

	public Usuario(String nome, int id) {
		super(nome);
		this.id = id;
	}

	public Usuario(String nome, String email, int id, LocalDate dataCadastro) {
		super(nome, email);
		this.id = id;
		this.dataCadastro = dataCadastro;
	}

	public void exibirDados() {
		String dadosUsuario = "Nome: " + getNome() + "\nE-mail: " + getEmail() + "\nID: " + id + "\nData de Cadastro: " + dataCadastro;
		JOptionPane.showMessageDialog(null, dadosUsuario, "Dados do Usuario", JOptionPane.INFORMATION_MESSAGE);
	}
}