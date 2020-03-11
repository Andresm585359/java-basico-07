package br.fai.projeto07;

public class Main {

	public static void main(String[] args) {
			
		Main app = new Main();
		app.Start();

	}

	private void Start() {

		int resultado1 = somadorDeGalinhas( 5 , 5 );
		double resultado2 = somadorDeMeioGalinhas( 10.27 , 10.42);
		String resultado3 = somadorDeGalinhasDeQIalto("44", "Porque a galinha quer atravessar a rua?");
		System.out.println("Resultado 1: "+ resultado1 + "   Resultado 2: " + resultado2 + "   Resultado 3: " + resultado3);
		
	}

	private String somadorDeGalinhasDeQIalto(String galinhaesperta1, String galinhaesperta2) {
		String resultado = galinhaesperta1 + " " + galinhaesperta2; // PS: sei q o " " eh desnecessario mas fica mais bunitinho :v
		return resultado;
	}

	private int somadorDeGalinhas(int galinha1, int galinha2) {
		
		int resultado;
		resultado = galinha1 + galinha2;
		return resultado;
	}

	private double somadorDeMeioGalinhas(double galinha1 , double galinha2) {
		
		double resultado;
		resultado = galinha1 + galinha2;
		return resultado;
	}

}
