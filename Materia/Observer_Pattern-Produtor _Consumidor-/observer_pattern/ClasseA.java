import javax.swing.JOptionPane;

class ClasseA implements IConsumidor {
	public void atualizar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem + " Para " + getClass().getName());
	}
}