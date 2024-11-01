import java.time.LocalDate;

class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestmo;
    private LocalDate dataDevolucao;


    public Emprestimo(Usuario usuario ,Livro livro, LocalDate dataEmprestmo , LocalDate dataDevolucao){
        if (usuario == null){
            System.out.println("Usuario deve existir!");
        }
			
		if (livro == null){
            System.out.println("Livro deve existir!");
        }
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestmo = dataEmprestmo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDados(){
        usuario.exibirDados();
        livro.exibirDados();
        System.out.println("Data do emprestimo : " + dataEmprestmo);
        System.out.println("Data da devolução : " + dataDevolucao);

    }



}