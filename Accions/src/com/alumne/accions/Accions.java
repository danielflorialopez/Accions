package com.alumne.accions;

public class Accions {

	/**
	 * 
	 * @param preu
	 * @param ticker
	 * @return si el ticker no està a la cadena retorna -1 si el preu és negatiu
	 *         torna -2 si el preu és major de 500 torna -3 qualsevol altre cas
	 *         retorna 0
	 */
	public int registrarPreu(double preu, String ticker) {

		// Si fora real guardaria a la base de dades el nom de l'empresa i el valor de
		// l'acció
		// però com es tracta d'una prova només els mostra per pantalla

		String tickersValids = "AAPL AMZN FB GOOGL";

		int comparacio = tickersValids.indexOf(ticker);
		if (comparacio == -1) {

			System.out.println("El ticker no és vàlid");

			return -1;
		}

		if (preu < 0.0) {

			System.out.println("El preu és menor que el valor mínim permés");

			return -2;

		}

		if (preu > 500.0) {

			System.out.println("El preu és superior al valor màxim permés");
			return -3;
		}

		System.out.println("Valors registrats, ticker: " + ticker + ", preu: " + preu);
		return 0;
	}

	/**
	 * 
	 * @return un preu màxim de prova
	 */
	public double preuMax() {
		// Un programa real es connectaria a una base de dades per a mirar el preu més
		// alt
		// com és per a una prova ràpida mostra un valor predeterminat
		return 455.0;
	}

	/**
	 * 
	 * @return un ticker màxim de prova
	 */
	public String tickerMax() {
		// Un programa real es connectaria a una base de dades per a mirar l'empresa amb
		// el preu més alt
		// com ús per a una prova ràpida mostra un valor predeterminat
		return "AAPL";
	}

	/**
	 * 
	 * @return un preu mínim de prova
	 */
	public double preuMin() {
		// Igual per als valors mínims
		return 150.0;
	}

	/**
	 * 
	 * @return un ticker mínim de prova
	 */
	public String tickerMin() {
		// Igual per als valors mínims
		return "FB";
	}

}
