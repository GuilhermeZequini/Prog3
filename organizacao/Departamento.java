import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class Departamento {
	private List<Funcionario> funcionarios;

	public Departamento() {
		funcionarios = new ArrayList<>();
	}

	public void adicionar(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public void remover(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}

	public void listarFuncionarios() {
		for (Funcionario funcionario : funcionarios)
			JOptionPane.showMessageDialog(null, funcionario);
	}
}