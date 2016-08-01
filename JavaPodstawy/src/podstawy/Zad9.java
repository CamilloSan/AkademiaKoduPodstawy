package podstawy;

import java.util.Scanner;

public class Zad9 {
	/*
	 * Mamy pojemniki. Do pojemników wk³adamy klocki. Kiedy zabraknie miejsca w
	 * pojemniku - bierzemy nastêpny. W ka¿dym pojemniku mieœci siê s klocków.
	 * Napisz program, który podaje ile potrzeba pojemników, aby przechowaæ n
	 * klocków oraz ile klocków jest w ostatnim u¿ytym pojemniku.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe klocków?");
		int namber = sc.nextInt();
		System.out.println("Podaj pojemnoœæ pojemnika?");
		int containerNambers = sc.nextInt();
		int answerN = namber/containerNambers;
		
		if(namber%containerNambers==0){
		System.out.println("Potrzebujesz "+ answerN +" pojemnków.");
		}else{
			System.out.println("Potrzebujesz "+ (answerN+1) +" pojemnków a w ostanim pojemniku bêdzie "+namber%containerNambers + " klocków.");
		}
	}

}
