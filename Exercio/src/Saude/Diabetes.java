package Saude;

public class Diabetes extends Doenca {

	public Diabetes(String nome, String sintoma) {
		super(nome, sintoma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tratamento() {
		// TODO Auto-generated method stub
		return " Parar de comer acucar";
	}

	@Override
	public String tratamento2() {
		// TODO Auto-generated method stub
		return "Sempre medir";
	}

}
