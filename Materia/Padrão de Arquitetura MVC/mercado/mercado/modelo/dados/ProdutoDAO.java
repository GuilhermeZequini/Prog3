package mercado.modelo.dados;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mercado.modelo.Produto;

public class ProdutoDAO {
	public void inserir(Produto produto) throws Exception {
		Statement statement = null;
		
		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/MERCADO?" + "user=mercado&password=123456");) {
			statement = conexao.createStatement();
			statement.execute("INSERT INTO PRODUTO (PROD_TX_DESCRICAO, PROD_VL_PRECO) VALUES ('" + produto.getDescricao() + "', " + produto.getPreco() + ");");
		} 
		catch (SQLException excecao) {
			throw new Exception("Erro na insercao de um produto: " + excecao);
		}
	}

	public void atualizar(Produto produto) throws Exception {
		Statement statement = null;
		
		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/MERCADO?" + "user=mercado&password=123456");) {
			statement = conexao.createStatement();
			statement.execute("UPDATE PRODUTO SET PROD_TX_DESCRICAO = '" + produto.getDescricao() + "', PROD_VL_PRECO = " + produto.getPreco() + " WHERE PROD_ID_PRODUTO = " + produto.getId() + ";");
		} 
		catch (SQLException excecao) {
			throw new Exception("Erro na atualizacao de um produto: " + excecao);
		}
	}

	public void remover(Produto produto) throws Exception {
		Statement statement = null;
		
		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/MERCADO?" + "user=mercado&password=123456");) {
			statement = conexao.createStatement();
			statement.execute("DELETE FROM PRODUTO WHERE PROD_ID_PRODUTO = " + produto.getId() + ";");
		} 
		catch (SQLException excecao) {
			throw new Exception("Erro na remocao de um produto: " + excecao);
		}
	}

	public List<Produto> listar() throws Exception {
		List<Produto> produtos = new ArrayList<>();
		Statement statement = null;
		ResultSet conjuntoDados = null;

		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/MERCADO?" + "user=mercado&password=123456");) {
			statement = conexao.createStatement();
			conjuntoDados = statement.executeQuery("SELECT PROD_ID_PRODUTO, PROD_TX_DESCRICAO, PROD_VL_PRECO FROM PRODUTO;");

			if (conjuntoDados != null)
				while (conjuntoDados.next())
					produtos.add(new Produto(conjuntoDados.getInt("PROD_ID_PRODUTO"), conjuntoDados.getString("PROD_TX_DESCRICAO"), conjuntoDados.getFloat("PROD_VL_PRECO")));
		} 
		catch (SQLException excecao) {
			throw new Exception("Erro na obtencao de produtos: " + excecao);
		}

		return (produtos);
	}
}