package lt.vtmc.aliona.pd9;

import java.util.Arrays;

public class PD9_4 {
	static int [] masyvas1 = {23,45,12,3,78,98,15,-3};
	static int[] masyvas2 = {2,12,24,15,48,64,-5,65};
	static boolean xflag = true;
	static boolean yflag = true;
	public static void main(String[] args) {
		
		
		for (int i = 0; i<masyvas2.length; i ++) {
			for (int y = 0; y <masyvas1.length; y++) {
				if (masyvas2[i] != masyvas1[y]) {
					xflag = false;
				}
				else {
					xflag =true;
					break;
					
				}
			}
			if (xflag == false) {
				int [] masyvas3 = {masyvas2[i]};
				System.out.println(Arrays.toString(masyvas3));
			}
			
		}

	}

}
