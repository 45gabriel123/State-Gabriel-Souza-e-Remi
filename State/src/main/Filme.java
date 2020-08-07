package main;

public class Filme {
	private EstadoFilme estado;    // implementa associa��o com o estado

	private String titulo;

	/** O construtor da classe, al�m de apresentar o nome do
	 *  filme, define o estado inicial (Dispon�vel). Como neste caso
	 *  os estados de filmes t�m o seu pr�prio estado, usamos um Singleton.
	 */

	public Filme(String titulo) {
	  this.titulo = titulo;
	  this.estado = Disponivel.instancia();
	}

	public String toString() {
	  return (this.titulo + "" );
	}

	/** Este m�todo modifica o estado do filme. O m�todo deve
	 *  ser acessado a partir de uma classe externa (EstadoFilme), o que exclui
	 *  a visibilidade private e protected. Neste caso, usamos a
	 *  visibilidade de pacote, com Filme e os seus estados no mesmo pacote.
	 */

	void estabelecerEstado(EstadoFilme estado) {
	  System.out.println("Passando de " + this.estado + " a " + estado);
	  this.estado = estado;
	}

	public void devolver() {
	  this.estado.devolver(this);
	}

	public boolean solicitar() {
	  return this.estado.solicitar(this);
	}
}
