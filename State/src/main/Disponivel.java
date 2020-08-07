package main;

public class Disponivel extends EstadoFilme{
	/** Uma vez que neste exemplo os estados dos filmes n�o v�o conter
	 *  atributos dependentes do contexto, fazemos com que Disponivel seja um
	 *  Singleton
	 */ 

	private static Disponivel instancia; // Inst�ncia do Singleton Disponivel

	protected Disponivel() {}

	public static Disponivel instancia() {
		if (instancia == null)
			instancia = new Disponivel();

	 	return instancia;
	}

		  /* M�todos espec�ficos deste estado concreto. Solicitar modifica o estado do filme*/

	public boolean solicitar(Filme filme) {
		System.out.println("Emprestando o filme " + filme);
		filme.estabelecerEstado(Emprestado.instancia());
		return true;
	}

	public void devolver(Filme filme) {
		System.out.println("O filme " + filme + " j� foi devolvido");
	}

	// Redefine o nome do estado para origem

	public String toString() {
		return "Disponivel";
	}
}
