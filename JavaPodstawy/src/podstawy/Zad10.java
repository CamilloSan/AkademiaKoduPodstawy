package podstawy;

import java.util.Scanner;

public class Zad10 {
	/*
	 * Napisz program, kt�ry odczytuje dwie zmienne i na ekran wypisuje
	 * komunikat sprawdzaj�cy czy obie zmienne s� r�wne.
	 */
	public static void main(String[] args) {
		System.out.println("Program por�wnuje 2 liczby kt�re s�: int lub String.");
		System.out.println("1.Program por�wnuje 2 liczby(int).");
		System.out.println("2.Program por�wnuje 2 liczby(String).");
		System.out.println("Podaj 1 lub 2.");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		switch (number) {
		case 1:
			int a, b;
			System.out.println("Program por�wnuje 2 liczby(int).");
			System.out.println("Podaj liczbe a?");
			a = sc.nextInt();
			System.out.println("Podaj liczbe b?");
			b = sc.nextInt();

			if (a == b) {
				System.out.println("Poda�e� a:" + a + " i " + "poda�e� b:" + b);
				System.out.println("Liczby s� takie same");
			} else {
				System.out.println("Poda�e� a:" + a + " i " + "poda�e� b:" + b);
				System.out.println("Liczby si� r�zni�");
			}
			break;
		case 2:

			String word01;
			String word02;
			do {
				Scanner sc01 = new Scanner(System.in);
				System.out.println("Podaj s�owo 1?");
				word01 = sc01.nextLine();
				System.out.println("Podaj s�owo 2?");
				word02 = sc01.nextLine();
				System.out.println("Sprubuj jeszcze raz !!!");

			} while (!(word01.equals(word02)));
			System.out.println("Uda�o ci sie. Gratuluje");
			break;

		default:
			System.out.println("Nie podale� porawnego wyboru... error...");
		}

	}

}
