package podstawy;

import java.util.Scanner;

public class Zad1 {

	// Napisz program, kt�ry deklaruje 2 zmienne ca�kowite i na ekran wypisuje
	// ich sum� 

	public static void main(String[] args) {

		int a, b;
		System.out.println("Program dodaje 2 liczby(int).");
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe a?");
		a = sc.nextInt();
		System.out.println("Podaj liczbe b?");
		b = sc.nextInt();
		System.out.println("---------------");
		// dodanie 2 zmiennych
		System.out.println("dobra forma (a + b)");
		System.out.println("Suma 2 liczb to: " + (a + b));
		System.out.println("---------------");
		// wynik = wypisanie warto�ci zmienych jako String a i b (1 i 2 = 12),
		// nie dodaje sie w taki sps�b
		System.out.println("z�� forma  a + b");
		System.out.println("Suma 2 liczb to: " + a + b);

	}

}
