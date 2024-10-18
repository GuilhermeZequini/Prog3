import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class Equipe {
	private String nome;
	private Funcionario lider;
	private List<Funcionario> membros;

	public Equipe(String nome, Funcionario lider) {
		this.nome = nome;
		this.lider = lider;
		membros = new ArrayList<>();
	}

	public void adicionarMembro(Funcionario funcionario) {
		membros.add(funcionario);
	}

	public void removerMembro(Funcionario funcionario) {
		membros.remove(funcionario);
	}

	public void exibirMembros() {
		for (Funcionario membro : membros) {
			membro.exibirDados();
		}
	}

	public void exibirBonus() {
		for (Funcionario membro : membros) {
			JOptionPane.showMessageDialog(null, "Bonus de " + membro.getNome() + ": " + membro.calcularBonus(), "Bonus", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}