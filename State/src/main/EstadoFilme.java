package main;

public abstract class EstadoFilme {
	
	public abstract void devolver(Filme filme);
	public abstract boolean solicitar(Filme filme);

	/** Adicionamos um m�todo com um String que identifica o estado
	 *  do filme -- a defini��o estabelece um valor por padr�o que ser�
	 *  usado se as subclasses n�o o redefinirem.
	 */

	public String toString() {
		return "Desconhecido";
	}
}
