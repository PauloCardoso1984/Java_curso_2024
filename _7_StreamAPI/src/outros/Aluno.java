package outros;

public class Aluno {
	
	final String nome;
	final double nota;
	final boolean comComportamento;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, double nota, boolean comComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.comComportamento = comComportamento;
	}
	
	@Override
	public String toString() {
		return nome + " tem nota = " + nota;
	}
}
