class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;

    public Livro(String titulo , String autor , int anoPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public void exibirDados (){
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor : " + autor);
        System.out.println("Ano de Publicação : " + anoPublicado);

    }
}