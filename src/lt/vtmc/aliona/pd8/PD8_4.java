package lt.vtmc.aliona.pd8;

public class PD8_4 {
	private static int [] numbers = {2,5,8,4,2,3};
	private static int sum = 0;
	
	public static void main(String[] args) {
		
		getsum();
		System.out.println(sum);
		int average = getaverage();
		System.out.println(average);

	}

	public static void getsum() {
		for (int i = 0; i < numbers.length; i++) {
		sum += numbers[i];
		}
	}
     public static int getaverage() {
		int average = sum / numbers.length;
		return average;
	}
}
