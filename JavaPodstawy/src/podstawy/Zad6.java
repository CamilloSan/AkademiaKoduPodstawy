package podstawy;

import java.util.Scanner;

public class Zad6 {
//Stwórz program, który odczytujê dan¹ liczbê i sprawdza czy jest podzielna przez 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Podaj liczbe?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%4==0){
			System.out.println("Liczba jest podzielna przez 4");
		}else{
			System.out.println("Liczba nie dzilei siê przez 4");
		}
	}

}
