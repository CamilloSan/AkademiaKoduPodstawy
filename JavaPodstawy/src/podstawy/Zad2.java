package podstawy;

import java.util.Scanner;

public class Zad2 {
	// Napisz program, kt�ry odczytuje 2 zmienne i zamienia je.
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Program dczytuje 2 zmienne i zamienia je miejscami.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe a?");
		a = sc.nextInt();
		System.out.println("Podaj liczbe b?");
		b = sc.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("Poda�e� a?");
		System.out.println("Poda�e� b?");
		System.out.println("---------------");
		System.out.println("Warto�� a " + a + " " + "A warto�� b to " + b);

	}

}
