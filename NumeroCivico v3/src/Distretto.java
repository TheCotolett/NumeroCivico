
public class Distretto {
	private Scuola arrayScuola[];
	private Plesso arrayPlesso[];

	// Costruttore di defaul per inizializzare gli array
	public Distretto(int dim) {
		this.arrayScuola = new Scuola[dim];
		this.arrayPlesso = new Plesso[dim];
	}

	// Costruttore di copia, che riceve
	// un altro oggetto distretto e fa una copia degli array
	public Distretto(Distretto distretto) {
		for (int i = 0; i < distretto.getArrayPlesso().length; i++) {
			this.arrayScuola[i] = distretto.getPlessoInPosition(i);
		}
		for (int i = 0; i < distretto.getArrayScuola().length; i++) {
			this.arrayScuola[i] = distretto.getScuolaInPosition(i);
		}
	}

	// Ritorno dell'oggetto plesso nella posizione i dell'array
	public Plesso getPlessoInPosition(int i) {
		return arrayPlesso[i];
	}

	// Ritorno dell'oggetto scuola nella posizione i dell'array
	public Scuola getScuolaInPosition(int i) {
		return arrayScuola[i];
	}

	// Setter dell'oggetto plesso nella posizione i dell'array
	public void setPlessoInPosition(int i, Plesso p) {
		this.arrayPlesso[i] = p;
	}

	// Setter dell'oggetto scuola nella posizione i dell'array
	public void setScuolaInPosition(int i, Scuola s) {
		this.arrayScuola[i] = s;
	}

	// Ritorno di tutto l'array plesso
	public Plesso[] getArrayPlesso() {
		return arrayPlesso;
	}

	// Ritorno di tutto l'array scuola
	public Scuola[] getArrayScuola() {
		return arrayScuola;
	}

	// Set di tutto l'array plesso
	public void setArrayPlesso(Plesso[] arrayPlesso) {
		this.arrayPlesso = arrayPlesso;
	}

	// Set di tutto l'array scuola
	public void setArrayScuola(Scuola[] arrayScuola) {
		this.arrayScuola = arrayScuola;
	}

	// Metodo per eliminare un oggetto dall'array scuola ponendolo null
	public void eraseScuolaInPosition(int i) {
		this.arrayScuola[i] = null;
	}

	// Metodo per eliminare un oggetto dall'array plesso ponendolo null
	public void erasePlessoInPosition(int i) {
		this.arrayPlesso[i] = null;
	}

	// Metodo di stampa di tutti gli elementi di distretto
	public void printAllDistretto() {
		for (int i = 0; i < arrayPlesso.length; i++) {
			if (arrayPlesso[i] != null) // Controllo per verificare se l'oggetto non è nullo
				System.out.print("\n" + arrayPlesso[i].getVia() + " n." + arrayPlesso[i].getCivico() + " piani:"
						+ arrayPlesso[i].getPiani());
		}
		for (int i = 0; i < arrayScuola.length; i++) {
			if (arrayScuola[i] != null) // Controllo per verificare se l'oggetto non è nullo
				System.out.print("\n" + arrayScuola[i].getVia() + " n." + arrayScuola[i].getCivico());
		}
	}
	
}
	