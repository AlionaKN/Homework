package lt.vtmc.aliona.pd9;

public class PD9_2 {
    
	public static double getJan () {
	double [] jan = {-11.5, -10.3, -12, -6.5, -5, -15.5};
	double jansum = 0;
	double janaver = 0;
	
	for (int i = 0 ; i < jan.length; i ++) {
		jansum += jan[i];
		janaver = jansum / jan.length;
	}
	return janaver;}
	
	public static double getFeb () {
		double [] feb = {-16, -14.5, -11, -10.3, -3.5, 0};
		double febsum = 0;
		double febaver = 0;
		
		for (int i = 0 ; i < feb.length; i ++) {
			febsum += feb[i];
			febaver = febsum / feb.length;
		}
		return febaver;
	
	}
	public static double getMar () {
		double [] mar = {-3, -2.5, 0, 5, 9.5, 11.2};
		double marsum = 0;
		double maraver = 0;
		
		for (int i = 0 ; i < mar.length; i ++) {
			marsum += mar[i];
			maraver = marsum / mar.length;
		}
		return maraver;
	
	}
	public static void main(String[] args) {
		
		double janAverg = getJan ();
System.out.printf("%s%1.2f%n", "Januar average: " , janAverg);
double febAverg = getFeb ();
System.out.printf("%s%1.2f%n", "February average: " , febAverg);
double marAverg = getMar ();
System.out.printf("%s%1.2f%n", "March average: " , marAverg);

	}
	}


