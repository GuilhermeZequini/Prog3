class Principal {
	public static void main(String[] args) {
		ClasseD objetoD = new ClasseD();
		ClasseE objetoE = new ClasseE();
		ClasseA objetoA = new ClasseA();
		
		objetoD.inserir(objetoA);
		objetoD.inserir(new ClasseB());
		objetoD.inserir(new ClasseC());
		objetoD.inserir(new ClasseA());
		objetoD.inserir(new ClasseC());
		objetoE.inserir(objetoA);

		objetoD.notificar("Atualizacao ocorrida");
		objetoE.notificar("Atualizacao ocorrida");
	}
}