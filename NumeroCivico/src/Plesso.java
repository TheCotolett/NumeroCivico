public class Plesso extends Scuola {
	private int piani;

	// Costruttore sottoclasse con ritorno dell'eccezzione
	public Plesso(String via, int civico, int piani) throws CivicNumberException {
		super(via, civico);
		this.setPiani(piani);
	}

	// Metodi setter e getter
	public int getPiani() {
		return piani;
	}

	public void setPiani(int piani) {
		this.piani = piani;
	}
}
