
public class PianoException extends Exception {
	private String msg;

	// Costrutore eccezione
	public PianoException(String msg) {
		this.msg = msg;
	}

	// Ritorna messaggio di errore
	public String log() {
		return msg;
	}
}
