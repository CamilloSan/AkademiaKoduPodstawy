package podstawy;

import java.util.Scanner;

public class Zad9 {
	/*
	 * Mamy pojemniki. Do pojemnik�w wk�adamy klocki. Kiedy zabraknie miejsca w
	 * pojemniku - bierzemy nast�pny. W ka�dym pojemniku mie�ci si� s klock�w.
	 * Napisz program, kt�ry podaje ile potrzeba pojemnik�w, aby przechowa� n
	 * klock�w oraz ile klock�w jest w ostatnim u�ytym pojemniku.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe klock�w?");
		int namber = sc.nextInt();
		System.out.println("Podaj pojemno�� pojemnika?");
		int containerNambers = sc.nextInt();
		int answerN = namber/containerNambers;
		
		if(namber%containerNambers==0){
		System.out.println("Potrzebujesz "+ answerN +" pojemnk�w.");
		}else{
			System.out.println("Potrzebujesz "+ (answerN+1) +" pojemnk�w a w ostanim pojemniku b�dzie "+namber%containerNambers + " klock�w.");
		}
	}

}
