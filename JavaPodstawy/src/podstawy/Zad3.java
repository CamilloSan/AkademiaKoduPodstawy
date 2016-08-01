package podstawy;

import java.util.Scanner;

public class Zad3 {
	// Napisz program, który odczytuje liczbê typu double i na ekran wypisuje
	// ca³kowit¹ wartoœæ tej liczby.
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
