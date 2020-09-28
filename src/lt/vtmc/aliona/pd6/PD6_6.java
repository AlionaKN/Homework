package lt.vtmc.aliona.pd6;

import java.util.Scanner;

public class PD6_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kiek zuvu gyvena jusu akvariume siuo metu?:");
		int fishAtStart = scan.nextInt();
		System.out.println("Kiek zuvu papildote kiekviena diena?");
		int fishUpdate = scan.nextInt();
		System.out.println("Kiek jau praejo dienu, kai pildete akvariuma naujomis zuvimis?");
		int daycount = scan.nextInt();
		System.out.println("Po tiek dienu, jusu akvariume gyvena " + (fishAtStart + (fishUpdate * daycount)));
	
	
	}
	
	
}
