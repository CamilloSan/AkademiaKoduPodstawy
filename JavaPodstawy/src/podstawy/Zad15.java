package podstawy;

import java.util.Scanner;

public class Zad15 {
	// Napisz program, kt�ry odczytuje dany wyraz z konsoli tak d�ugo a� natrafi
	// na
	// poprawnie wprowadzone has�o.

	public static void main(String[] args) {
		String password = "Alabama";
		String x;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Podaj Has�o?");
			x = sc.next();

		} while (!(password.equals(x)));
		System.out.println("Poda�e� w�a�ciwe Has�o!! Gratuluje");

	}

}
