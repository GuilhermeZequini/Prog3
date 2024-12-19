import javax.swing.JOptionPane;

class ClasseB implements IConsumidor {
	public void atualizar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem + " Para " + getClass().getName());
	}
}