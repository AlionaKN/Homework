package lt.vtmc.aliona.pd8;

import java.util.Arrays;

public class PD8_5 {

	public static void main(String[] args) {
		int [] numbers = {2,5,-8,4,2,3};
		int n = numbers.length;
		System.out.println(getMinValue(numbers,n));
		
////		int min = getMinValue(numbers);
////		System.out.println(min);
//		Arrays.sort(numbers);
//		System.out.println(numbers [0]);

	}
  public static int getMinValue (int [] numbers, int n) {
	  
	 
		  if (n == 1)
	      return numbers[0];
		  return Math.min(numbers[n-1], getMinValue(numbers, n-1));
  }
}
