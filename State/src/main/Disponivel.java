package main;

public class Disponivel extends EstadoFilme{
	/** Uma vez que neste exemplo os estados dos filmes não vão conter
	 *  atributos dependentes do contexto, fazemos com que Disponivel seja um
	 *  Singleton
	 */ 

	private static Disponivel instancia; // Instância do Singleton Disponivel

	protected Disponivel() {}

	public static Disponivel instancia() {
		if (instancia == null)
			instancia = new Disponivel();

	 	return instancia;
	}

		  /* Métodos específicos deste estado concreto. Solicitar modifica o estado do filme*/

	public boolean solicitar(Filme filme) {
		System.out.println("Emprestando o filme " + filme);
		filme.estabelecerEstado(Emprestado.instancia());
		return true;
	}

	public void devolver(Filme filme) {
		System.out.println("O filme " + filme + " já foi devolvido");
	}

	// Redefine o nome do estado para origem

	public String toString() {
		return "Disponivel";
	}
}
