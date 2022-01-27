
public class CivicNumberException extends Exception {
	private String msg;
	
	//Costruttore dell'eccezione
	public CivicNumberException(String msg) {
		this.msg=msg;
	}
	//Ritorna messaggio di errore
	public String log() {
		return msg;
	}
}