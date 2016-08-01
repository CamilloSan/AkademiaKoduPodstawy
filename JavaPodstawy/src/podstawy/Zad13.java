package podstawy;

import java.util.Scanner;

public class Zad13 {
	// Napisz program, który odczytuje napis i wypisuje go wspak.
	public static void main(String[] args) {

		System.out.println("Podaj wyraz?");
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		for(int i =x.length()-1;i>=0;i--){
			System.out.print(x.charAt(i));
		}

	}

}
