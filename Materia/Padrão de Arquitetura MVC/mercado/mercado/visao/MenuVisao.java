package mercado.visao;

import javax.swing.JOptionPane;

public class MenuVisao {
	public int exibir() {
		String mensagem = "### Sistema de Gestão de Produtos ###\n";
		mensagem += "1- Cadastrar\n";
		mensagem += "2- Atualizar\n";
		mensagem += "3- Remover\n";
		mensagem += "4- Listar\n";
		mensagem += "0- Sair\n";

		return (Integer.parseInt(JOptionPane.showInputDialog(null, mensagem, "Menu Principal", JOptionPane.QUESTION_MESSAGE)));
	}

	public void notificar(String mensagem, int tipo) {
		JOptionPane.showMessageDialog(null, mensagem, "Menu Principal", tipo);
	}
}