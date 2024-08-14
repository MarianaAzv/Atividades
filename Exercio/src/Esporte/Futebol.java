package Esporte;

public class Futebol extends Esporte{

	public Futebol(String nome, String modalidade) {
		super(nome, modalidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Competir() {
		// TODO Auto-generated method stub
		return "Quadra";
	}

	@Override
	public String Treinar() {
		// TODO Auto-generated method stub
		return "Chute";
	}

}
