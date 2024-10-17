class Funcionario extends Pessoa{
    private float salario;
    private String dataContratacao;

    
    public Funcionario (String nome , float salario){
        super();
        this.salario = salario;
        this.dataContratacao = "17/10/2024";

    }


    public Funcionario (String nome , int idade , float salario , String dataContratacao){
        super(nome , idade);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
    }


    public float calcularBonus(){
        return (salario * 0.1);

    }
}