package podstawy;

import java.util.Scanner;

public class Zad5 {
    //Stwórz program, który odczytuje wiek danej osoby i wypisujê na ekran komunikat
	// czy dana osoba jest pe³noletnia czy niepe³noletnia.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Podaj wiek?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a > 18){
			System.out.println("Jesteœ doros³y.");
		}else{
			System.out.println("Jesteœ niepe³noletni.");
		}
		

	}

}
