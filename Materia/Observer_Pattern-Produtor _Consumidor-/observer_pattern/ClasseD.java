import java.util.List;
import java.util.ArrayList;

class ClasseD implements IProdutor {
	private List<IConsumidor> consumidores;

	public ClasseD() {
		consumidores = new ArrayList<>();
	}

	public void inserir(IConsumidor consumidor) {
		consumidores.add(consumidor);
	}

	public void remover(IConsumidor consumidor) {
		consumidores.remove(consumidor);
	}

	public void notificar(String mensagem) {
		for (IConsumidor consumidor : consumidores)
			consumidor.atualizar(mensagem + " De " + getClass().getName());
	}
}