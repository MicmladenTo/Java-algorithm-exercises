package vezbanje;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int godina;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite godinu: ");
		godina = scn.nextInt();
		
		if(godina%400==0 || (godina%4==0 && godina%100!=0 && godina%400!=0)) {
			System.out.println("Godina je prestupna!");
		} else {
			System.out.println("Godina nije prestupna.");
		}
	}
}
//Napisite program koji kaze da li je godina prestupna ili ne

/* 1. број године дељив са четири, и
2. важи једно од следећа два:

број године није дељив са 100
број године је дељив са 400 */