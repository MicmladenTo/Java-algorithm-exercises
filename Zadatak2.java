package vezbanje;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int uneseniBroj;
		int suma = 0;
		double prosek;
		
		Scanner scn = new Scanner(System.in);
	
		for(int i=1; i<=5; i++) {
			
			System.out.println("Unesite " + i + " broj: ");
			uneseniBroj = scn.nextInt();
			
			suma = suma + uneseniBroj;
		}
		prosek = ((double) suma / 5);
		
		System.out.println("Suma svih brojeva je: " + suma);
		System.out.println("Prosek svih brojeva je: " + prosek);
	}

}
//Write a program in Java to input 5 numbers from keyboard and find their sum and average

// Možemo da kažemo i (double)suma/5