import java.time.LocalDate;

class Principal{
    public static void main (String[] args){
			Usuario usuario1 = new Usuario("Joao Kleber", "joao@kleber.com", 20, LocalDate.now());
        
			Livro livro1 = new Livro("Java: Como Programar", "Deitel", 2010);

			Emprestimo emprestimo = new Emprestimo(usuario1, livro1, LocalDate.now(), LocalDate.now());

            emprestimo.exibirDados();

    }
}