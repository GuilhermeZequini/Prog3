import java.util.List;
import java.util.ArrayList;

class Usuario {
	private static List<Usuario> usuarios;
	private String nome;
	private String login;
	private String senha;
	private List<String> funcionalidades;

	// ESTE BLOCO É O INICIALIZADOR ESTÁTICO EM JAVA.
	// ESTA ESTRUTURA É EXECUTADA UMA ÚNICA VEZ EM 
	// QUE A CLASSE É REFERENCIADA.
	// UMA VEZ EXECUTADA, ESTA ESTRUTURA NÃO SERÁ MAIS
	// EXECUTADA.
	static {
		usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Joao da Silva", "joao@joao", "123456", null));
		usuarios.add(new Usuario("Maria do Nascimento", "maria@nascimento", "654321", null));
	}

	public Usuario(String nome, String login, String senha, List<String> funcionalidades) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.funcionalidades = funcionalidades;
	}

	public static List<Usuario> listar() {
		return (usuarios);
	}

	public String getNome() {
		return (nome);
	}
}