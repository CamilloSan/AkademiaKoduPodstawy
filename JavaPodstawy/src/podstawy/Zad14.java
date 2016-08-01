package podstawy;

import java.util.Scanner;

public class Zad14 {
	// Napisz program, który wypisuje co drug¹ literê imienia.
	public static void main(String[] args) {
		System.out.println("Podaj Imie?");
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		// i+=2;
		// i = i+2;

		for (int i = 0; i <= x.length(); i += 2) {
			System.out.print(x.charAt(i));
		}

	}

}
