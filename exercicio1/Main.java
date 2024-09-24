class Main{
	public static void main (String [] args){
        // Criando dois clientes
        Cliente cliente1 = new Cliente(12345, "Agência 001", 5000);
        Cliente cliente2 = new Cliente(67890, "Agência 002", 3000);

        cliente1.Depositar(5000);

        cliente1.Sacar(0);

        cliente1.Transferir(cliente2, 300);

        cliente1.ImprimirExtrato();

        System.out.println();

        cliente2.ImprimirExtrato();
        
        
    }
}