package podstawy;

import java.util.Scanner;

public class Zad10 {
	/*
	 * Napisz program, który odczytuje dwie zmienne i na ekran wypisuje
	 * komunikat sprawdzaj¹cy czy obie zmienne s¹ równe.
	 */
	public static void main(String[] args) {
		System.out.println("Program porównuje 2 liczby które s¹: int lub String.");
		System.out.println("1.Program porównuje 2 liczby(int).");
		System.out.println("2.Program porównuje 2 liczby(String).");
		System.out.println("Podaj 1 lub 2.");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		switch (number) {
		case 1:
			int a, b;
			System.out.println("Program porównuje 2 liczby(int).");
			System.out.println("Podaj liczbe a?");
			a = sc.nextInt();
			System.out.println("Podaj liczbe b?");
			b = sc.nextInt();

			if (a == b) {
				System.out.println("Poda³eœ a:" + a + " i " + "poda³eœ b:" + b);
				System.out.println("Liczby s¹ takie same");
			} else {
				System.out.println("Poda³eœ a:" + a + " i " + "poda³eœ b:" + b);
				System.out.println("Liczby siê rózni¹");
			}
			break;
		case 2:

			String word01;
			String word02;
			do {
				Scanner sc01 = new Scanner(System.in);
				System.out.println("Podaj s³owo 1?");
				word01 = sc01.nextLine();
				System.out.println("Podaj s³owo 2?");
				word02 = sc01.nextLine();
				System.out.println("Sprubuj jeszcze raz !!!");

			} while (!(word01.equals(word02)));
			System.out.println("Uda³o ci sie. Gratuluje");
			break;

		default:
			System.out.println("Nie podaleœ porawnego wyboru... error...");
		}

	}

}
