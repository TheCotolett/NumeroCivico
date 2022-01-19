import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(final String[] args) {
		// Creazione oggetto di tipo scanner
		Scanner get = new Scanner(System.in);
		String via;
		boolean flag = true;
		int civico;
		int piano;
		// Allocazione in memoria di oggetti scuola e plesso vuoti
		Scuola scuola = null;
		Plesso plesso = null;

		// Ciclo do while per ripetere inserimento in caso di eccezzione
		do {
			System.out.println("Inserisci via e numero");
			via = get.next();
			civico = get.nextInt();
			// Try per instanziazione di scuola
			try {
				scuola = new Scuola(via, civico);
				flag = true;
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

		do {
			System.out.println("Inserisci via, numero e piano");
			via = get.next();
			civico = get.nextInt();
			piano = get.nextInt();
			// Try per instanziazione di scuola
			try {
				plesso = new Plesso(via, civico, piano);
				flag = true;
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
		// Stampa finale
		System.out.print(scuola.getVia() + " " + scuola.getCivico() + "\n");
		System.out.print(plesso.getVia() + " " + plesso.getCivico() + " " + plesso.getPiani() + "\n");

	}

}
