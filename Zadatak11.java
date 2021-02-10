package vezbanje;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dan;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite redni broj dana: ");
		dan = scn.next();

		
		switch(dan) {
		case "ponedeljak":
		{
			System.out.println("Ponedeljak pada na: ");
			for(int i = 1; i <= 31; i+=7 ) {
				System.out.println(i);
			}
			break;
		}
		case "utorak":
		{	
			System.out.println("Utorak pada na: ");
			for(int i = 2; i <= 31; i+=7 ) {
				System.out.println(i);
			}
			break;
		}
		case "sreda":
		{
			System.out.println("Sreda pada na: ");
			for(int i = 3; i <= 31; i+=7 ) {
				System.out.println(i);
			}
			break;
		}
		case "èetvrtak":
		{	
			System.out.println("Èetvrtak pada na: ");
			for(int i = 4; i <= 31; i+=7 ) {
				System.out.println(i);
			}
			break;
		}
		case "petak":
		{
			System.out.println("Petak pada na: ");
			for(int i = 5; i <= 31; i+=7 ) {
				System.out.println(i);
			}
			break;
		}
		case "subota":
		{
			System.out.println("Subota pada na: ");
			for(int i = 6; i <= 31; i+=7 ) {
				System.out.println(i);
			}
			break;
		}
		case "nedelja":
		{
			System.out.println("Nedelja pada na: ");
			for(int i = 7; i <= 31; i+=7 ) {
				System.out.println(i);
			}
			break;
		}
		default:
			System.out.println("To što ste uneli nije dan");
			
		}
		}
		
		
	}
//prvi dan u mesecu je ponedeljak, a mesec ima 31 dan
		//korisnik unosi dan u nedelji, a program treba da kaze
		//na koje dane u mesecu pada taj dan
		//primer ispisa:
		//utorak pada na
		//2
		//9
		//16
		//23
		//30

		//dan u mesecu