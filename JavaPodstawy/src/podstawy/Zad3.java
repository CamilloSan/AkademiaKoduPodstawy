package podstawy;

import java.util.Scanner;

public class Zad3 {
	// Napisz program, kt�ry odczytuje liczb� typu double i na ekran wypisuje
	// ca�kowit� warto�� tej liczby.
	public static void main(String[] args) {
		System.out.println("Podaj liczbe z przecinkiem");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();

		System.out.println("Twoja lczba to z przeciniekiem:  " + a);
		System.out.println("------------");
		System.out.println("Twoja lczba bez przecinka:  " + ((int) a));
		sc.close();
	}

}
