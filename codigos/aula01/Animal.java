class Animal {
	private String especie;
	private String sexo;
	private float peso;
	private int idade;
	private int id;

	public Animal(String especie){
		// this é a alocação de memória 
		this.especie = especie;
		idade = 0;
	}

	public void comer (){}

	public float defecar(){
		return 0.0f;
	}
	public void exibirInformacoes(){
		System.out.println("Esse animal e uma " + especie);
		System.out.println("A idade dele e " + idade);
		System.out.println("E esse e " + this );
		System.out.println();
	}
}