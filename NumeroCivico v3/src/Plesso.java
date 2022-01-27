public class Plesso extends Scuola {
	private int piani;

	// Costruttore sottoclasse con ritorno dell'eccezzione
	public Plesso(String via, int civico, int piani) throws CivicNumberException, PianoException {
		super(via, civico);
		if (piani >= 1 && piani <= 10) {
			this.piani = piani;
		} else
			throw new PianoException("Numero piani non valido");
	}

	// Metodi setter e getter
	public int getPiani() {
		return piani;
	}

	public void setPiani(int piani) throws PianoException {
		if (piani >= 1 && piani <= 10) {
			this.setPiani(piani);
		} else
			throw new PianoException("Numero piani non valido");
	}
}
