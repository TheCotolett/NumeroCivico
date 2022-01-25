public class Scuola {
	private int civico;
	private String via;

	// Costruttore scuola
	public Scuola(String via, int civico) throws CivicNumberException {
		// Controlla numero civico e ritorna eccezzione se errato
		if (civico <= 100 && civico >= 1) {
			this.civico = civico;
		} else {
			throw new CivicNumberException("Numero civico incorretto");
		}
		this.via = via;
	}

	// Metodi getter e setter
	public int getCivico() {
		return civico;
	}

	public String getVia() {
		return via;
	}

	// Metodo setter del Civico con controllo e ritorno di eccezzione
	public void setCivico(int civico) throws CivicNumberException {
		if (civico <= 100 && civico >= 1) {
			this.civico = civico;
		} else { // Ritorno dell'eccezzione
			throw new CivicNumberException("Numero civico incorretto");
		}
	}

	public void setVia(String via) {
		this.via = via;
	}
}