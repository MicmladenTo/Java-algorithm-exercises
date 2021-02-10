package vezbanje;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int brojZvezda;
		String zvezda = "*";
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj zvezda: ");
		brojZvezda = scn.nextInt();
		
		for(int i=1; i<=brojZvezda; i++) {
			System.out.println(zvezda);
			zvezda = zvezda + "*";
		}
	}
}
//Napisati program koji stampa sliku na
//ekranu za N redova.N unosi korisnik
//Unesite N: 5
//*
//* *
//* * *
//* * * *
//* * * * *