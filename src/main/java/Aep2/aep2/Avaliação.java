package Aep2.aep2;

public class Avaliação {
	private Disciplina disciplina ;
	private float nota ;
	private Aluno aluno ;
	
	
	public Avaliação (Disciplina disciplina ,Aluno aluno, float nota) {
		this.disciplina = disciplina ;
		this.nota = nota ;
		this.aluno = aluno;
	}


	public Disciplina getDisciplina() {
		return disciplina;
	}


	public float getNota() {
		return nota;
	}


	public Aluno getAluno() {
		return aluno;
	}

}
