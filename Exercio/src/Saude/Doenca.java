package Saude;

public abstract class Doenca {

	
	String nome;
	String sintoma;
	
	
	public Doenca(String nome, String sintoma) {
		this.nome = nome;
		this.sintoma = sintoma;
	
	}
	
	public abstract String tratamento();
	public abstract String tratamento2();
	public void  falar() {
		System.out.println("A(o) " + nome + "  tem " + sintoma + " trata com  " + tratamento() );
        System.out.println("e" + tratamento2());		
	}
	
	
}
