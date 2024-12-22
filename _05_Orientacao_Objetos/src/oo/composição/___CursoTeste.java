package oo.composição;

public class ___CursoTeste {

	public static void main(String[] args) {
	
		___Aluno aluno1 = new ___Aluno("Paulo");
		___Aluno aluno2 = new ___Aluno("Reginaldo");
		___Aluno aluno3 = new ___Aluno("Cardoso");

		___Curso curso1 = new ___Curso("HTML");
		___Curso curso2 = new ___Curso("Web 2023");
		___Curso curso3 = new ___Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		// Buscando aluno de um determinado curso
		for (___Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1: ");
			System.out.println("Aluno = " + aluno.nome + "\n");
		}
		for (___Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso 3: ");
			System.out.println("Aluno = " + aluno.nome + "\n");
		}
		for (___Curso curso: aluno1.cursos) {
			System.out.println("Estou matriculado no aluno 1: ");
			System.out.println("Curso = " + curso.nome + "\n");
		}
		for (___Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome + "...");
			System.out.println("Aluno = " + aluno.nome + "\n");
		}		
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		System.out.println(aluno1.obterCursoPorNome("Matematica"));
		
		___Curso cursoEncontrado = aluno1.obterCursoPorNome("HTML");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
