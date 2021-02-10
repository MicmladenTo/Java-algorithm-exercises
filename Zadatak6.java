package vezbanje;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int broj;
		int suma = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Koliko brojeva sabiramo: ");
		n = scn.nextInt();
		
		for(int i = 1; i <= n; n--) {
			
			
			System.out.println("Unesite broj: ");
			broj = scn.nextInt();
			
			if(broj%2==0) {
				suma = suma + broj;
			}
		}
		System.out.println("Suma parnih brojeva je: " + suma);
		System.out.println("Kraj programa.");
	}

}
//Napisati program koji ucitava N brojeva od korisnika
//i racuna sumu samo parnih brojeva.
//Unesite N: 4
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 5
//Unesite broj: 8
//Suma je: 10