import javax.swing.JOptionPane;

class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public void exibirDados() {
		String dadosLivro = "Titulo: " + titulo + "\nAutor: " + autor + "\nAno de Publicacao: " + anoPublicacao;
		JOptionPane.showMessageDialog(null, dadosLivro, "Dados do Livro", JOptionPane.INFORMATION_MESSAGE);
	}
}