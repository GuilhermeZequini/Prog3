class Cliente {
    private int NumeroConta;
    private String Agencia;
    private float Saldo;
    private float Limite;

    public Cliente (int NumeroConta ,String Agencia ,float Limite){
        this.NumeroConta = NumeroConta;
        this.Agencia = Agencia;
        this.Limite = Limite;   
    }

    public int getNumeroConta (){
        return NumeroConta;
    }

    public String getAgencia(){
        return Agencia;
    }

    public void setAgencia (String getAgencia){
        this.Agencia = Agencia;
    }

    public float getSaldo(){
        return Saldo;
    }

    public float getLimite (){
        return Limite;
    }

    public void setLimite(float valor){}

    public float Sacar(float valor){
        if(Saldo >= valor) {
        Saldo -= valor;
        return valor;
        } 
        else {
        return 0; // ou lançar uma exceção ou indicar que o saque foi mal-sucedido
        }
    }

    public void Depositar(float valor){
        Saldo += valor;
    }

    public boolean Transferir( Cliente cliente , float valor){
        if(this.Saldo >= valor){
        this.Saldo -= valor;
        cliente.Depositar(valor); // ou cliente.Saldo += valor;
        return true;
    } else {
        return false;
    }
    }




    public void ImprimirExtrato(){
        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite());
    }


}