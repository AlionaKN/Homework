package lt.vtmc.aliona.pd11;

public class PD11_3 {


public String getHex (String str) {
	StringBuffer sb = new StringBuffer();
	char [] ch = str.toCharArray();
	for ( int i = 0; i<ch.length; i++) {
		String hexString = Integer.toHexString(ch[i]);
		sb.append(hexString);
	}
   String result = sb.toString();
   return result;
}


}
