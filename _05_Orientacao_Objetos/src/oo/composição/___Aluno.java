package oo.composição;

import java.util.ArrayList;
import java.util.List;

public class ___Aluno {
	final String nome;
	final List<___Curso> cursos = new ArrayList<>();

	// CONSTRUTOR
	public ___Aluno(String nome) {
		this.nome = nome;
	}

	// METODO
	void adicionarCurso(___Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	// METODO
	___Curso obterCursoPorNome(String nome) {
		for (___Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return nome;
	}
}
