package vezbanje;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uneseniBroj;
		int max = 0;
		
		Scanner scn = new Scanner(System.in);
	
		for(int i=1; i<=5; i++) {
			
			System.out.println("Unesite " + i + " broj: ");
			uneseniBroj = scn.nextInt();
			
			if (uneseniBroj%3 == 0 && uneseniBroj > max) {
					max = uneseniBroj;
				}
			}
		if (max == 0) {
				System.out.println("Nijedan broj nije deljiv sa 3.");
		} else {
			System.out.println("Najveæi uneseni broj deljiv sa tri je: " + max);
		}
		
		}

	}

//uneti 5 brojeva sa tastature - koristeci petlju
	//od tih 5 ispisati najveci koji je deljiv sa 3
	//ako ni jeden nije deljiv sa 3 ispisati tu poruku