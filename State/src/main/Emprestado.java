package main;

public class Emprestado extends EstadoFilme{
	// Emprestado tamb�m ser� um Singleton.
	private static Emprestado instancia;  // Inst�ncia do Singleton Emprestado

	protected Emprestado() {}

	public static Emprestado instancia() {
		if (instancia == null) {
			instancia = new Emprestado();
		}
		return instancia;
	}

	/* M�todos espec�ficos deste estado concreto. Devolver altera
	   para Disponivel, e solicitar retorna false. */

	public boolean solicitar(Filme filme) {
		System.out.println("O filme " + filme + " n�o est� dispon�vel");
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
