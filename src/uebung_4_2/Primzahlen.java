package uebung_4_2;

public class Primzahlen {
	public static boolean isPrimzahl(int testzahl) {

		boolean ergebnis = true;

		for (int n = 2; n <= testzahl - 1; n++) {
			if ((testzahl % n) == 0) {
				ergebnis = false;
			}
		}
		if (ergebnis) {
			System.out.println(testzahl + " ist eine Primzahl!");
		} else {
			System.out.println(testzahl + " ist keine Primzahl!");
		}
		return ergebnis;
	}

	public static void main(String[] args) {

		for(int testzahl = 2; testzahl<=1000; testzahl++)
		{isPrimzahl(testzahl);}
	}
}