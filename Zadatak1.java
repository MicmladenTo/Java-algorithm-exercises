package vezbanje;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int najveciBroj = 0;
		int uneseniBroj;
		
		Scanner scn = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("Unesite broj za proveru: ");
			uneseniBroj = scn.nextInt();
			
			if (uneseniBroj > najveciBroj) {
				najveciBroj = uneseniBroj;
			}
		}
		System.out.println("Najveæi broj je: " + najveciBroj);
		
	}

}
//uneti 5 brojeva koristeci petlju
//ispisati koji je najveci od unetih
//Primer ispisa: najveci broj od unetih je 23

// Problem je ako su svi brojevi negativni, rešenje je 0!