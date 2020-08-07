package main;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filme f1 = new Filme("X-Men Trilogia");
		Filme f2 = new Filme("Your Name");

		f1.solicitar();    // Disponível -> Emprestado
		f1.solicitar();    // Ops, o filme já está emprestado
		f1.devolver();     // Emprestado -> Disponível

	    f2.devolver();     // nada, o filme já está disponível
	}

}
