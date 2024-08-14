package Saude;

public class Respiratória extends Doenca {

	public Respiratória(String nome, String sintoma) {
		super(nome, sintoma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tratamento() {
		// TODO Auto-generated method stub
		return "respire ar puro";
	}

	@Override
	public String tratamento2() {
		// TODO Auto-generated method stub
		return " Procure medico";
	}

	
}
