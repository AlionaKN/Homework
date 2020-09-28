package lt.vtmc.aliona.pd8;

import java.util.Scanner;

public class PD8_3 {
private static Scanner scan = new Scanner(System.in);
private static double [] moliugai = {1,1,1,1,1};
private static double moliuguCount;
private static double minWeight = 2.50;
private static double maxWeight = 5.00;
private static int counter = 0;
    
    public static void main(String[] args) {
		
    	moliuguKiekis();
		double vidSvoris = moliuguSvoris ();
		System.out.println("Vidutinis jusu moliugu svoris: " + vidSvoris);
		double tinkantysMoliugai = tinkantysMoliugai ();
		System.out.println("I supirkima atrinkta: " + Math.round(tinkantysMoliugai) );
		double sumatinkanciu = tinkanciuSvoris();
		System.out.println("Atrinktu vidutinis svoris: " + sumatinkanciu);

	}
    
    public static double tinkanciuSvoris () {
    	double sumTinkanciu = 0;
    	double averageTinkanciu = 0;
    
    	for (int i = 0; i < moliugai.length; i++) {
    		if (moliugai[i] >= minWeight && moliugai [i] <= maxWeight) {
    			sumTinkanciu += moliugai [i];
    			averageTinkanciu = sumTinkanciu / counter;
    			}
    		
    		}
    	return averageTinkanciu;
    }
    
    
    
    public static double tinkantysMoliugai () {
 
    	for (double i : moliugai) {
    		if (i >= minWeight && i <= maxWeight) {
    			counter ++;
    		}
    		
    	}
    	return counter;
    	
    	
    }
    
    
    
    
    public static double moliuguSvoris () {
	
	double sum = 0;
	double averageWeight = 0;

	  System.out.println("Kiek sveria jusu moliugai?: ");
        for (int i = 0; i < moliuguCount; i ++) {
        	moliugai [i] = scan.nextDouble();
        }
        for (int i = 0; i < moliugai.length; i++) {
        	sum+= moliugai[i];
        	averageWeight = sum / moliugai.length;
        }
        return averageWeight;

	
    }	
	
	
 public static void moliuguKiekis () {
	 System.out.println("Kiek turite moliugu?: ");
		 moliuguCount = scan.nextDouble();
	 
 }
}
