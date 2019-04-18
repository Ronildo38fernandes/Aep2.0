package Aep2.aep2;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Aluno aluno = new Aluno("ronildo","16163112");
    	Disciplina materia = new Disciplina("programação2");
    	
    	Avaliação prova = new Avaliação(materia, aluno, 50f);
    	Aluno aluno2 = new Aluno("ronildo","16163112");
    	Disciplina materia2 = new Disciplina("matematica");
    	Avaliação prova2 = new Avaliação(materia2, aluno2, 30f);
    	RepositorioDeAvaliações repo = new RepositorioDeAvaliações();
    	repo.addAv(prova2);
    	repo.addAv(prova);
    	repo.addAv(prova);
    	repo.addAv(prova2);
   System.out.println(repo.getAvaliações());
    	
    	
    }
}
