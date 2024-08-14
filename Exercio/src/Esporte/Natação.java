package Esporte;

public class Natação extends Esporte  {

	public Natação(String nome, String modalidade) {
		super(nome, modalidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Competir() {
		// TODO Auto-generated method stub
		return "Piscina";
	}

	@Override
	public String Treinar() {
		// TODO Auto-generated method stub
		return "nado";
	}

}
