import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		// Creazione oggetto di tipo scanner
		@SuppressWarnings("resource")
		Scanner get = new Scanner(System.in);
		String via;
		boolean flag = true;
		int civico;
		int piano;
		// Allocazione in memoria di oggetti scuola e plesso vuoti
		Scuola scuola1 = null;
		Scuola scuola2 = null;
		Scuola scuola3 = null;
		Plesso plesso1 = null;
		Plesso plesso2 = null;
		Plesso plesso3 = null;

		// Ciclo do while per ripetere inserimento in caso
		// di eccezzione durante instanziamento di oggetti Scuola
		do {
			System.out.println("Inserisci via e numero");
			via = get.next();
			civico = get.nextInt();

			// Try per instanziazione di scuola
			try {
				scuola1 = new Scuola(via, civico);
				flag = true;

				scuola2 = new Scuola("Via Giuseppe", 24);
				scuola3 = new Scuola("Via Roma", 74);

			}
			// Catch eccezzione numero civico
			catch (CivicNumberException ce) {
				System.out.print(ce.log());
				flag = false;
			}
			// Catch eccezzione input mismatch
			catch (InputMismatchException ime) {
				System.out.println("Input errato, reinserisci");
			}
			// Catch eccezzione generale
			catch (Exception ex) {
				System.out.println("\nQualcosa è andato storto. Reinserisci");
			}
		} while (!flag);

		// Ciclo do while per ripetere inserimento in caso
		// di eccezzione durante instanziamento di oggetti Plesso
		do {
			System.out.println("Inserisci via, numero e piano");
			via = get.next();
			civico = get.nextInt();
			piano = get.nextInt();

			// Try per instanziazione di scuola
			try {
				plesso1 = new Plesso(via, civico, piano);
				flag = true;

				plesso2 = new Plesso("Via Bari", 17, 4);
				plesso3 = new Plesso("Via Napoli", 89, 8);

			}
			// Catch eccezzione numero civico
			catch (CivicNumberException ce) {
				System.out.print(ce.log());
				flag = false;
			}
			// Catch eccezzione piano
			catch (PianoException pe) {
				System.out.print(pe.log());
				flag = false;
			}
			// Catch eccezzione input mismatch
			catch (InputMismatchException ime) {
				System.out.println("Input errato, reinserisci");
				flag = false;
			}
			// Catch eccezzione generale
			catch (Exception ex) {
				System.out.println("\nQualcosa è andato storto. Reinserisci");
				flag = false;
			}
		} while (!flag);

		// Iniziallizzazione array con degli oggetti
		Scuola arrayS[] = { scuola1, scuola2, scuola3 };
		Plesso arrayP[] = { plesso1, plesso2, plesso3 };

		// Instanziamento dell'oggetto distretto
		Distretto distretto = new Distretto(arrayS.length);

		// Set degli array dell'oggetto distretto
		distretto.setArrayPlesso(arrayP);
		distretto.setArrayScuola(arrayS);
		// Stampa di tutti gli elementi di distretto
		distretto.printAllDistretto();

		// Ciclo do while per provare il metodi di
		// eliminazione di un elemento dall'array
		// e catch dell'eccezzione IndexOutOfBounds
		do {
			try {
				System.out.print("\n\nPosizione dell'array plesso da eliminare: ");
				int i = get.nextInt();

				distretto.erasePlessoInPosition(i);
				flag = true;
			} catch (IndexOutOfBoundsException ioob) {
				System.out.print("\nIndice inserito non valido. Reinserire");
				flag = false;
			}
		} while (!flag);

		// Stampa finale di tutti gli elementi di distretto
		distretto.printAllDistretto();
	}

}
