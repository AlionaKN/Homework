package lt.vtmc.aliona.pd6;

import java.util.Scanner;

public class PD6_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		double wallheight, walllength,bricketheight, bricketlength,price,sum,bricketcount;
		
		System.out.println("Kokio ilgio nori sienos?");
		walllength = scan.nextDouble();
		System.out.println("Kokio aukscio nori sienos?");
		wallheight = scan.nextDouble();
		System.out.println("Kokio ilgio turi plyta?");
		bricketlength = scan.nextDouble();
		System.out.println("Kokio aukscio turi plyta?");
		bricketheight = scan.nextDouble();
		System.out.println("Kiek kainuoja viena plyta?");
		price = scan.nextDouble();
		bricketcount = (walllength * wallheight)/(bricketlength * bricketheight);
		System.out.println("Jums reikes tiek plytu:" + bricketcount);
		System.out.println("Jums tai kainuos:" + price * bricketcount);
		}


	}


