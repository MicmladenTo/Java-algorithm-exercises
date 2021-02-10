package vezbanje;

import java.util.Scanner;

public class Zadatak13  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int K; // poèetni broj redova
		int N; // konaèni broj redova
		String zvezda = "*";
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite N: ");
		N = scn.nextInt();
		
		System.out.println("Unesite K: ");
		K = scn.nextInt();
		
		for(int i = K; i <= N; i++) {
			for(int kolona = 0; kolona < i; kolona++) {
				System.out.println("*");
			}	
		}
	}
}

//Napisati program koji stampa sliku na 
//ekranu za N redova.N i K unosi korisnik
//Unesite N: 5
//Unesite K: 3
//* * *
//* * * *
//* * * * *