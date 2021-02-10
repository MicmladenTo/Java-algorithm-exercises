package vezbanje;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int godina;
		int mesec;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite godinu: ");
		godina = scn.nextInt();
		
		System.out.println("Unesite redni broj meseca: ");
		mesec = scn.nextInt();
		

		switch(mesec) {
		case 1:
		{
			System.out.println("Januar " + godina + ". ima 31 dan.");
		}
		break;
		case 2:
		{
			if(godina%4==0 && (godina%100!=0 || godina%400==0)) {
				System.out.println("Februar " + godina + ". ima 29 dana.");
			} else {
				System.out.println("Godina nije prestupna.");
			}
			
		}
		break;
		case 3:
		{
			System.out.println("Mart " + godina + ". ima 31 dan.");
		}
		break;
		case 4:
		{
			System.out.println("April " + godina + ". ima 30 dana.");
		}
		break;
		case 5:
		{
			System.out.println("Maj " + godina + ". ima 31 dan.");
		}
		break;
		case 6:
		{
			System.out.println("Jun " + godina + ". ima 30 dana.");
		}
		break;
		case 7:
		{
			System.out.println("Jul " + godina + ". ima 31 dan.");
		}
		break;
		case 8:
		{
			System.out.println("Avgust " + godina + ". ima 31 dan.");
		}
		break;
		case 9:
		{
			System.out.println("Septembar " + godina + ". ima 30 dana.");
		}
		break;
		case 10:
		{
			System.out.println("Oktobar " + godina + ". ima 31 dan.");
		}
		break;
		case 11:
		{
			System.out.println("Novembar " + godina + ". ima 30 dana.");
		}
		break;
		case 12:
		{
			System.out.println("Decembar " + godina + ". ima 31 dan.");
		}
		break;
		
		}
		
	}

}
/*Napisati program koji na osnovu unetog rednog broja meseca i godine kaze koliko taj mesec ima dana
primer inputa 1 i 2021
ispis Januar 2021. ima 31 dan */