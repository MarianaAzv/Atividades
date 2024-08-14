package Esporte;

public class Basquete extends Esporte{

	public Basquete(String nome, String modalidade) {
		super(nome, modalidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Competir() {
		// TODO Auto-generated method stub
		return "Quadra especifica";
	}

	@Override
	public String Treinar() {
		// TODO Auto-generated method stub
		return "Arremeco";
	}

}
