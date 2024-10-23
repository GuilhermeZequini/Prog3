public class PessoaFisica extends Cliente { // Usando extends para herdar de Classe1

    private int CPF;
    private String Nome;

    public PessoaFisica (int NumeroConta ,String Agencia ,int CPF , String Nome){
        super(NumeroConta ,Agencia ,limite);
    }

    public int getCFP(){
        return CPF;
    }

    public String getNome(){
        return Nome;
    }

    
}