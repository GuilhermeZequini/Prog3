class Principal {
	public static void main(String[] argumentos) throws InterruptedException {
		Semaforo semaforo = Semaforo.VERDE;

		while (true)
			switch (semaforo) {
				case VERDE:
					System.out.println(semaforo.getCor());
					Thread.sleep(3000);
					semaforo = Semaforo.AMARELO;
				break;
				case AMARELO:
					System.out.println(semaforo.getCor());
					Thread.sleep(1000);
					semaforo = Semaforo.VERMELHO;
				break;
				case VERMELHO:
					System.out.println(semaforo.getCor());
					Thread.sleep(3000);
					semaforo = Semaforo.VERDE;
				break;
			}
	}
}