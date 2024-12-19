class Terceirizado extends funcionario{
    private String empresaContratada;

    public Terceirizado(String nome , int idade , float salario , String dataContratacao, String empresaContratada ){
        super(nome, idade, salario , dataContratacao );
        this.empresaContratada = empresaContratada;
    }

     public Terceirizado(String nome , float salario , String empresaContratada ){
        super(nome, salario);
        this.empresaContratada = empresaContratada;
    }

    @Overrid
     public float calcularBonus(){
        return (salario * 0.5);

    }

}