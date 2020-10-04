package lt.vtmc.aliona.pd11;

import java.util.ArrayList;

public class PD11_2 {

	public ArrayList <Integer> getPrimeNumbers(int start, int end) {
		ArrayList <Integer> primes = new ArrayList <Integer>();
		
		
		for ( int n = start; n< end; n++) {
		boolean prime = true;
		
		int i = 2;
		while (i <= n/2) {
			if (n%i == 0) {
				prime = false;
				break;
			}
			i++;
		}
		if (prime) {
			primes.add(n);
		}
		}
	return primes;
	
}
}
