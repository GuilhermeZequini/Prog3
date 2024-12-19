interface IProdutor {
	void inserir(IConsumidor consumidor);
	void remover(IConsumidor consumidor);
	void notificar(String mensagem);
}