package Educacao;



public class MainPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoas Professor = new Professor("Professor","Ensina");
		Pessoas Aluno = new Aluno("Aluno","Estuda");
		Pessoas Funcionário = new Funcionário("Funcionário","trabalha");
		
		Professor.Ensinar();
		Aluno.estudar();
		Funcionário.trabalhar();
		
		
	}

}
