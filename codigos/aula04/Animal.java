class Animal {
	private String sexo;
	private float peso;
	private int idade;
	private int id;


	public Animal(int id ,String sexo ,float peso){
		this.id = id;
		this.sexo = sexo;
		this.peso = peso;
	}
	public void comer(){}
	public float defecar (){
		return 10.0f;
	}
	public void exibirInformacoes (){
		System.out.printf("Sexo: %s peso: %.2f  idade : %d  id: %d \n",sexo, peso, idade, id);
		
	}

}