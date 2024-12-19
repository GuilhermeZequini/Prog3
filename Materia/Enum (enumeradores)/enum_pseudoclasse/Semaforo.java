public enum Semaforo {
	VERDE("ABERTO"),
	AMARELO("ATENÇÃO"),
	VERMELHO("FECHADO");

	private final String cor;

	Semaforo(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return (cor);
	}
}