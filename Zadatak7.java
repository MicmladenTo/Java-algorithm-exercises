package vezbanje;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int suma = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		num = scn.nextInt();
		
		while(num!=0) {
			
			suma = suma + num;
			
			System.out.println("Unesite broj: ");
			num = scn.nextInt();
			
		}
		
		System.out.println("Suma brojeva je " + suma);
		System.out.println("Kraj programa.");
	}

}
//Napisati program koji sabira brojeve
//od korisnika sve dok ne unese nulu.