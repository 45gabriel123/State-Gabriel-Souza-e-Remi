package main;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filme f1 = new Filme("X-Men Trilogia");
		Filme f2 = new Filme("Your Name");

		f1.solicitar();    // Dispon�vel -> Emprestado
		f1.solicitar();    // Ops, o filme j� est� emprestado
		f1.devolver();     // Emprestado -> Dispon�vel

	    f2.devolver();     // nada, o filme j� est� dispon�vel
	}

}
