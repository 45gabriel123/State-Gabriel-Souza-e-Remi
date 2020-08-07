package main;

public class Emprestado extends EstadoFilme{
	// Emprestado também será um Singleton.
	private static Emprestado instancia;  // Instância do Singleton Emprestado

	protected Emprestado() {}

	public static Emprestado instancia() {
		if (instancia == null) {
			instancia = new Emprestado();
		}
		return instancia;
	}

	/* Métodos específicos deste estado concreto. Devolver altera
	   para Disponivel, e solicitar retorna false. */

	public boolean solicitar(Filme filme) {
		System.out.println("O filme " + filme + " não está disponível");
		return false;
	}

	public void devolver(Filme filme) {
		System.out.println("Devolvendo o filme " + filme);
		filme.estabelecerEstado(Disponivel.instancia());
	}

	// Redefine o nome do estado para origem

	public String toString() {
		return "Emprestado";
	}
}
