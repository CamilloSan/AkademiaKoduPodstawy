package podstawy;

import java.util.Scanner;

public class Zad8 {
	// Napisz program, który oblicza silniê.
	// Napisz silniê przy u¿yciu Lambdy.
	// n!=1*2*#.....*n
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe?");
		int n = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			System.out.println("i " + i + " " + "fsctoria " + factorial);
		}
		System.out.println("Silnia = " + factorial);
	}

}
