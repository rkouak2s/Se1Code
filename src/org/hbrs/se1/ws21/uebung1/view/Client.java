package org.hbrs.se1.ws21.uebung1.view;

import org.hbrs.se1.ws21.uebung1.control.Translator;
import org.hbrs.se1.ws21.uebung1.control.factories.TranslateFactory;

public class Client {

	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 */
	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber 
		// mit dem übergegebenen Wert der Variable aNumber 
		// aufgerufen werden.
		//
		// Strenge Implementierung gegen das Interface Translator gewuenscht!

		// Verwendung Design Pattern: Factory Method
		// Problem: Inkonsitente Objekt-Erzeugung
		// Lösung / Vorteil: konsisente und zentrale Stelle zur objekt erzeugung
		Translator translator = TranslateFactory.createGermanTranslator();
		String result = translator.translateNumber(aNumber);



		System.out.println("Das Ergebnis der Berechnung: " +
				"[das Ergebnis an dieser Stelle]" + result  );

	}
}




