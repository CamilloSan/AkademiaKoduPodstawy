package podstawy;

import java.util.Scanner;

public class Zad15 {
	// Napisz program, który odczytuje dany wyraz z konsoli tak d³ugo a¿ natrafi
	// na
	// poprawnie wprowadzone has³o.

	public static void main(String[] args) {
		String password = "Alabama";
		String x;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Podaj Has³o?");
			x = sc.next();

		} while (!(password.equals(x)));
		System.out.println("Poda³eœ w³aœciwe Has³o!! Gratuluje");

	}

}
