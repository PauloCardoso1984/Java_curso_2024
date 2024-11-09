package oo.composição;

import java.util.ArrayList;
import java.util.List;

public class ___Curso {
	
	final String nome;
	final List<___Aluno> alunos = new ArrayList<>();
	
	// CONSTRUTOR
	public ___Curso(String nome) {
		this.nome = nome;
	}

	// METODO
	void adicionarAluno(___Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
