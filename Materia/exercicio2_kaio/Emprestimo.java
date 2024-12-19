import java.time.LocalDate;
import javax.swing.JOptionPane;

class Emprestimo {
	private Usuario usuario;
	private Livro livro;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;

	public Emprestimo(Usuario usuario, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) throws Exception {
		if (usuario == null)
			throw new Exception("Usuario deve existir!");
		if (livro == null)
			throw new Exception("Livro deve existir!");
		this.usuario = usuario;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}

	public void exibirDados() {
		String dadosEmprestimo = "Data do Emprestimo: " + dataEmprestimo + "\nData de Devolucao: " + dataDevolucao;
		JOptionPane.showMessageDialog(null, dadosEmprestimo, "Dados do Emprestimo", JOptionPane.INFORMATION_MESSAGE);
		usuario.exibirDados();
		livro.exibirDados();
	}
}