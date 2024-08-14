package jogoele;

public class MainPersonagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personagem Guerreiro = new Guerreiro("lalo","Espada");
		Personagem Arqueiro = new Arqueiro("lola","Arco e flecha");
		Personagem Mago = new Mago("lelu","Gachado");
		
		Guerreiro.falar();
		Arqueiro.falar();
		Mago.falar();
		
	}

}
