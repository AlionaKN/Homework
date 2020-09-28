package lt.vtmc.aliona.pd6;

import java.util.Scanner;

public class PD6_4 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kiek jus turite puodeliu?:");
		int cups = scan.nextInt();
		System.out.println("Jums iseina " + cups / 3 + " pilnos dezes " + "Ir jums lieka: " + cups % 3 + " netilpe puodeliai");	
			
		}

	

}
