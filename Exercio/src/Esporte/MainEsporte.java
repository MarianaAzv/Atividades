package Esporte;

public class MainEsporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Esporte Futebol = new Futebol("mama","Futebol");
		Esporte Basquete = new Basquete("meme","basquete");
		Esporte Natação = new Natação("mimi","natacao");
		
		
		Futebol.falar();
		Basquete.falar();
		Natação.falar();
	}

}
