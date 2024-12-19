import java.time.LocalDate;
import javax.swing.JOptionPane;

class Principal {
	public static void main(String[] args) {
		try {
			Usuario usuario1 = new Usuario("Joao Kleber", "joao@kleber.com", 20, LocalDate.now());
			Usuario usuario2 = new Usuario("Maria Joana", 19);
			Usuario usuario3 = null;

			Livro livro1 = new Livro("Java: Como Programar", "Deitel", 2010);
			Livro livro2 = new Livro("Core Java", "Cay Horstmann", 2010);
			Livro livro3 = null;

			Emprestimo emprestimo = new Emprestimo(usuario1, livro2, LocalDate.now(), LocalDate.now().plusDays(7));
			emprestimo.exibirDados();
		}
		catch (Exception excecao) {
			JOptionPane.showMessageDialog(null, excecao.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
}