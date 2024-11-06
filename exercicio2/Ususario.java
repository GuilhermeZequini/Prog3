import java.time.LocalDate;

class Usuario extends Pessoa{
    private int id;
    private LocalDate dataCadastro;

    public Usuario(String nome, String email , int id , LocalDate dataCadastro ){
        super(nome , email);
        this.id = id;
        this.dataCadastro = dataCadastro;
    }

    public Usuario(String nome, int id){
        super(nome);
        this.id = id;
    }

    public void exibirDados (){
        System.out.println("nome : " +  getNome());
        System.out.println("email : " + getEmail());
        System.out.println("ID : "+ id );
        System.out.println("Data de Cadastro : " + dataCadastro);
        System.out.println( );
        
    }

    

} 