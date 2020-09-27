package lt.vtmc.aliona.pd8;

import java.util.Scanner;

public class PD8_1 {
private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    System.out.println("Kiek siandien pardavete prekiu? ");
	    double [] visosPrekes = {1,1,1,1,1,1};
	    double prekiukiekis = scan.nextDouble();
	    double sum = 0;
	   
	    System.out.println("Kiek kainavo kiekviena parduota preke?: ");
	    for (int i = 0; i < prekiukiekis; i++) {
	    	visosPrekes[i] = scan.nextDouble();	
	    	}
	    	for (int i =0 ; i< visosPrekes.length; i ++) {
	    	sum += visosPrekes[i];
	    }
	    	System.out.println("Prekes is viso kainavo: "+ sum + " Ir vidutiniskai preke kainavo: " + Math.round(sum / prekiukiekis));
	}	
	

}