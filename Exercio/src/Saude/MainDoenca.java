package Saude;



public class MainDoenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doenca cardiovascular = new cardiovascular ("Sopro","Pula uma batida coracao");
		Doenca Diabetes = new Diabetes ("Muito acucar no sangue","Tontura");
		Doenca Respiratória = new  Respiratória ("Asma","Falta de ar");
		
		cardiovascular .falar();
		Diabetes.falar();
		Respiratória.falar();
	}

}
