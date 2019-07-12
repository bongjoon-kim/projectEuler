/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
 */
import java.math.BigDecimal;

public class Euler16 {

	public static void main(String[] args) {
		double multi = 1L;
		int sum = 0;
		
		multi = Math.pow(2, 1000);
		BigDecimal bd = new BigDecimal(multi);
		
		String str = bd.toString();
		
		for (int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(str.substring(i,i+1));
		}
		
		System.out.println("2^1000 : " + str);
		System.out.println("sum of the digit : " + sum);
	}

}
