package mercado.visao;

import java.util.List;

import javax.swing.JOptionPane;

import mercado.modelo.Produto;

public class ProdutoVisao {
	public Produto criar() {
		String descricao = JOptionPane.showInputDialog(null, "Informe a descricao do produto:", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);
		float preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a descricao do produto:", "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE));

		return (new Produto(descricao, preco));
	}

	public Produto atualizar(int id) {
		Produto produto = criar();
		produto.setId(id);

		return (produto);
	}

	public void listar(List<Produto> produtos) {
		String strProdutos = "";

		for (Produto produto : produtos)
			strProdutos += "ID: " + produto.getId() + ", Nome: " + produto.getDescricao() + ", Preco: " + produto.getPreco() + "\n";
		JOptionPane.showMessageDialog(null, strProdutos, "Lista de Produtos", JOptionPane.INFORMATION_MESSAGE);
	}

	public int obterId() {
		return (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do produto:", "Atualização de Produto", JOptionPane.QUESTION_MESSAGE)));
	}
}