package uebung_4_2;

public class Primzahlen {
	
	public static boolean isPrimzahl(int testzahl) {


		for (int n = 2; n <= testzahl - 1; n++) {
			if ((testzahl % n) == 0) {
				return false;
			}
		}	
		return true;
	}

	public static int ermittleAnzahlPrimzahlen(int start, int ende) {
		
		int anzahlPrimzahlen = 0;
		
		for (int k = start; k < ende; k++)
			{if(isPrimzahl(k)) {anzahlPrimzahlen++;}}
		return anzahlPrimzahlen;
		}
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			// Blockgrenzen berechnen
			int start = (i * 1000) + 1;
			int ende = start + 999;

			// Geforderte Statisische Angaben berechnen
			int anzahlTestzahlen = ende - start + 1;
			int anzahlPrimzahlen = ermittleAnzahlPrimzahlen(start, ende);
			// Tipp: Durch multiplikation mit einem double (100.0) rechnen
			// wir sofort im double-Zahlenraum und haben keine Integer-Division
			// mehr!
			double anteilProzent = 100.0 * anzahlPrimzahlen / anzahlTestzahlen;

			System.out.println("Block " + i + " von " + start + " bis " + ende + " enthaelt " + anzahlPrimzahlen
					+ " Primzahlen (" + anteilProzent + "%).");
	}
}}