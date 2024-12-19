import java.util.Map;
import java.util.HashMap;

import javax.swing.JOptionPane;

class Principal {
	public static void main(String[] args) {
		Map<Integer, Aluno> alunos = new HashMap<>();

		alunos.put(1, new Aluno("2678@stads", "Maria"));
		alunos.put(2, new Aluno("1234@stads", "Joao"));
		alunos.put(3, new Aluno("9754@stads", "Jose"));

		String strAlunos = "";
		for (Integer chave : alunos.keySet())
			strAlunos += alunos.get(chave).getNome() + "\n";
		JOptionPane.showMessageDialog(null, strAlunos, "Lista de Alunos", JOptionPane.INFORMATION_MESSAGE);

		System.out.println(JOptionPane.QUESTION_MESSAGE);
	}
}





/*
import java.util.Map;
import java.util.HashMap;

class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Programacao Orientada a Objetos");
		mapa.put(2, "Programacao Estruturada");
		mapa.put(3, "Programacao Web");
		mapa.put(4, "Programacao Movel");
		mapa.put(1, "Programacao Microeletronica");

		for (Integer chave : mapa.keySet())
			System.out.println(mapa.get(chave));

		mapa.remove(3);
		mapa.remove(1, "Programacao joao");

		for (Integer chave : mapa.keySet())
			System.out.println(mapa.get(chave));

		if (mapa.containsKey(5))
			mapa.remove(5);
	}
}*/