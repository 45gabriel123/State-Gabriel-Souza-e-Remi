package main;

public abstract class EstadoFilme {
	
	public abstract void devolver(Filme filme);
	public abstract boolean solicitar(Filme filme);

	/** Adicionamos um método com um String que identifica o estado
	 *  do filme -- a definição estabelece um valor por padrão que será
	 *  usado se as subclasses não o redefinirem.
	 */

	public String toString() {
		return "Desconhecido";
	}
}
