package podstawy;

import java.util.Scanner;

public class Zad11 {
	// Napisz program, który odczytujê imiê i wypisujê na ekran ostatni¹ literê
	// imienia.
	public static void main(String[] args) {
         System.out.println("Podaj Imie?");
         System.out.println("-------------");
		String name = new Scanner(System.in).next();
		int length = name.length();
		 System.out.println("-------------");
		System.out.println("Ostatnia litera twojego imienia to: "+name.charAt(length-1));

	}

}
