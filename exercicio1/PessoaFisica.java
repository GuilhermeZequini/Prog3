public class PessoaFisica extends Cliente { // Usando extends para herdar de Classe1

    private int cpf;
    private String nome;

    public PessoaFisica (int NumeroConta ,String Agencia ,int cpf , String nome){
        super(NumeroConta ,Agencia ,3000);
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getCFP(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

     public void imprimirExtrato(){
        System.out.println("CPF: " + cpf);
		System.out.println("Nome: " + nome);
        super.imprimirExtrato();
      
     }
}