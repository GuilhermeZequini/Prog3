class Main{
	public static void main (String [] args){
		Animal animal1 = new Animal (1 , "Macho" ,15.5f);
		Animal animal2 = new Animal (2 , "Femea",20.5f);

		animal1.exibirInformacoes();
		animal2.exibirInformacoes();
		
		animal1.comer();
	

		//System.out.printf("%f\n", animal2.defecar());

	}
}