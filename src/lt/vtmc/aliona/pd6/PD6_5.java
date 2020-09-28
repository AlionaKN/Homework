package lt.vtmc.aliona.pd6;

import java.util.Scanner;

public class PD6_5 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		    
			System.out.println("Koks jusu automobilio greitis vaziuojant per si tuneli?");
			float carspeed = scan.nextFloat();
			
			float road = 0.264f;
			
			System.out.println("Jus pravaziuosite per: " + ((3600 * road) / carspeed));
			
			}

		}