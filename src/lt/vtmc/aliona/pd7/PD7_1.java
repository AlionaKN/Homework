package lt.vtmc.aliona.pd7;

import java.util.Scanner;

public class PD7_1 {
private static int treecount = 0;
private static double HeightTotal = 0;
private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		getTreeCount();
		getAverage();
		System.out.println("Jusu egluciu vidutinis aukstis: " + HeightTotal/treecount);
		
	}
	public static double getAverage() {
		double treeHeight, average;
		System.out.println("Koks jusu egluciu aukstis?: ");
		for (double i = 0; i < treecount; i++) {
		treeHeight = scan.nextDouble();	
		HeightTotal += treeHeight;
//		average = HeightTotal / treecount;
	}	
		return HeightTotal;
		}
		
     public static void getTreeCount () {
    	System.out.println("Kiek atvezete egluciu?");
 		treecount = scan.nextInt();
    	 
     }
}
