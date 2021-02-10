package vezbanje;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int poslednjiUnos = 0;
		int uneseniBroj;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj : ");
		uneseniBroj = scn.nextInt();
		
		while(uneseniBroj > 0 ) {
			
			if(uneseniBroj != poslednjiUnos) {
				sum = sum + poslednjiUnos;
			} else {
				System.out.println("Rezultat ovih brojeva je: " + sum);
				break;
			}
			
			uneseniBroj = poslednjiUnos;
			
			System.out.println("Unesite broj : ");
			uneseniBroj = scn.nextInt();	
		}


		

		
		 
	}

}
//Napisati program koji sabira brojeve od korisnika sve dok 
//korisnik ne unese dva ista broja zaredom. Smatrati da korisnik unosi 
//brojeve vece od nule.
//Primer:
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 5
//Unesite broj: 7
//Unesite broj: 2
//Unesite broj: 2
//Suma je 20