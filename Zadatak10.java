package vezbanje;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int uneseniBroj = 0;
		int sum=0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj : ");
		uneseniBroj = scn.nextInt();
		
		while(uneseniBroj%2!=0) {
			sum += uneseniBroj;
			
			System.out.println("Suma je : " + sum);
			
			System.out.println("Unesite sledeći broj : ");
			uneseniBroj = scn.nextInt();
		}
		
			
			while(sum < 0) {
				System.out.println("Ispod nule ste! Unesite broj: ");
				uneseniBroj = scn.nextInt();
				sum += uneseniBroj;
				System.out.println("Ispod nule ste! Vaša trenutna suma je: " + sum + "Unesite broj: ");
			}
			System.out.println("Kоnačno ste u plusu! Rezultat je: " + sum);
		}
		

	}
		

//Napisati program koji ce primati unose brojeva sve dok ne unesemo parni broj
	//unete brojeve sabrati, ako je krajnji rezultat tog procesa negativan broj omoguciti unos novih
	//brojeva sve dok rezultat ne bude pozitivan