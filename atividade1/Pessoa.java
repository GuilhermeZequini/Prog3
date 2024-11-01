public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        this.idade = 45;
        this.nome = "Neymarson";
    }


    public Pessoa ( int idade , String nome){
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome(){
        return (nome);
    }
    
    public exibirDados(){
    }
}