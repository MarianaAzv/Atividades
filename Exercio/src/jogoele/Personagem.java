package jogoele;

public abstract class Personagem {

	String nome;
	String arma;
	
	public Personagem(String nome, String arma) {
		this.nome = nome;
		this.arma= arma;
	}
	
	public abstract String ataque();
	public void  falar() {
		System.out.println("A(o) " + nome + "  faz " + ataque() + " com a " + arma);
	}
	
	
}
