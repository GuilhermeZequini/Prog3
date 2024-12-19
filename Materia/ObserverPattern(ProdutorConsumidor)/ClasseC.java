import javax.swing.JOptionPane;

class ClasseC implements IConsumidor {
	public void atualizar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem + " Para " + getClass().getName());
	}
}