class Main{
	public static void main (String [] args){
          System.out.println("Olá mundo");

        
        // Criando dois clientes
        PessoaFisica cliente1 = new PessoaFisica(12345, "Agência 001", 123456 ,"Guilherme");
        PessoaJuridica cliente2 = new PessoaJuridica(67890, "Agência 002",12536 , "COOP", "IE" );

        cliente1.imprimirExtrato();
        cliente2.imprimirExtrato();

        cliente1.depositar(50000);
        cliente1.imprimirExtrato();

        cliente1.transferir(cliente2 ,10000);
        cliente1.imprimirExtrato();
        cliente2.imprimirExtrato();

        cliente1.sacar(10000);
        cliente1.imprimirExtrato();
  


        
    }
}