package com.alumne.accions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AccionsTest {

	@Test
	void registrarPreuTickerNoValid() {

		int resultatActual;
		int resultatEsperat = -1;

		Accions accio = new Accions();

		resultatActual = accio.registrarPreu(100.0, "INTEL");

		assertEquals(resultatActual, resultatEsperat, "Error, ticker no vàlid");

	}

	@Test
	void registrarPreuNegatiu() {
		int resultatActual;
		int resultatEsperat = -2;

		Accions accio = new Accions();

		resultatActual = accio.registrarPreu(-100.0, "AAPL");

		assertEquals(resultatActual, resultatEsperat, "Error, preu negatiu");
	}

	@Test
	void registrarPreuMassaGran() {
		int resultatActual;
		int resultatEsperat = -3;

		Accions accio = new Accions();

		resultatActual = accio.registrarPreu(1100.0, "AAPL");

		assertEquals(resultatActual, resultatEsperat, "Error, preu massa gran");
	}

	@Test
	void registrarPreuValid() {
		int resultatActual;
		int resultatEsperat = 0;

		Accions accio = new Accions();

		resultatActual = accio.registrarPreu(100.0, "AAPL");

		assertEquals(resultatActual, resultatEsperat, "Error, preu no vàlid");
	}

}
