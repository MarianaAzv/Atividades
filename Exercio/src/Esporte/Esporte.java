package Esporte;

public abstract class Esporte {

	String nome;
	String modalidade;
	
	public Esporte(String nome, String modalidade) {
		this.nome = nome;
		this.modalidade= modalidade;
	}
	
	public abstract String Competir();
	public abstract String Treinar();
	
	public void  falar() {
		System.out.println("A(o) " + nome + "  faz " + Competir() + Treinar() + " com a " + modalidade);
	}
	
	
}
