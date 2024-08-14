package Educacao;

public abstract class Pessoas {
	
	String nome;
	String Funcao;

	
	public Pessoas(String nome, String Funcao) {
		this.nome = nome;
	 this.Funcao= Funcao;
	}
	
	
	
	public void trabalhar() {
		System.out.println("A(o) " + nome + "  faz "  + " com a " + Funcao);
	}
	
	
	public void  Ensinar() {
		System.out.println("A(o) " + nome + "  faz "  + " com a " + Funcao);
	}

	public void  estudar() {
		System.out.println("A(o) " + nome + "  faz "  + " com a " + Funcao);
	}
}
