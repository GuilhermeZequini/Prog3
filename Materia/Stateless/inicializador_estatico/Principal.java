import javax.swing.JOptionPane;

class Principal {
	public static void main(String[] args) {
		for (Usuario usuario : Usuario.listar())
			JOptionPane.showMessageDialog(null, usuario.getNome());
	}
}