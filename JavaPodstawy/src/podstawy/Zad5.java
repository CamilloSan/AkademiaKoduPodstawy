package podstawy;

import java.util.Scanner;

public class Zad5 {
    //Stw�rz program, kt�ry odczytuje wiek danej osoby i wypisuj� na ekran komunikat
	// czy dana osoba jest pe�noletnia czy niepe�noletnia.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Podaj wiek?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a > 18){
			System.out.println("Jeste� doros�y.");
		}else{
			System.out.println("Jeste� niepe�noletni.");
		}
		

	}

}
