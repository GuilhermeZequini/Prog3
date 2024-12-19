package mercado.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import java.io.UnsupportedEncodingException;

import java.util.List;
import java.util.ArrayList;

import mercado.visao.MenuVisao;
import mercado.visao.ProdutoVisao;
import mercado.modelo.Produto;
import mercado.modelo.dados.ProdutoDAO;

public class ProdutoControlador {
	public static void main(String[] args) {
		MenuVisao menuVisao = new MenuVisao();
		ProdutoControlador produtoControlador = new ProdutoControlador();
		int opcao;

		do {
			opcao = menuVisao.exibir();
			produtoControlador.processar(opcao);
		}
		while (opcao != 0);
	}

	private void processar(int opcao) {
		ProdutoVisao produtoVisao = new ProdutoVisao();
		MenuVisao menuVisao = new MenuVisao();
		ProdutoDAO produtoDao = new ProdutoDAO();
		
		try {
			switch (opcao) {
				case 1: {
						Produto produto = produtoVisao.criar();
						produtoDao.inserir(produto);
						break;
					}
				case 2: {
						List<Produto> produtos = produtoDao.listar();
						produtoVisao.listar(produtos);
						
						int id = produtoVisao.obterId();
						for (Produto produto : produtos)
							if (produto.getId() == id) {
								produto = produtoVisao.atualizar(id);
								produtoDao.atualizar(produto);
							}
						break;
					}
				case 3: {
						List<Produto> produtos = produtoDao.listar();
						produtoVisao.listar(produtos);
						
						int id = produtoVisao.obterId();
						for (Produto produto : produtos)
							if (produto.getId() == id) {
								produtoDao.remover(produto);
							}
						break;
					}
				case 4: {
						List<Produto> produtos = produtoDao.listar();
						produtoVisao.listar(produtos);
						break;
					}	
				case 0:
					menuVisao.notificar("Saindo...\n(pressione OK para sair.)", 1);
					break;
				default:
					menuVisao.notificar("Opcao invalida!", 2);
				}
		}
		catch (Exception excecao) {
			menuVisao.notificar(excecao.getMessage(), 0);
		}
	}
}