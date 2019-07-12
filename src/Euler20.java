/*
n! means n × (n − 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!
*/
import java.math.*;

public class Euler20 {
	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		BigInteger bigNum = BigInteger.valueOf(1);
		
		for(int i = num; i > 0; i--) {
			bigNum = bigNum.multiply(BigInteger.valueOf(i));
		}
		
		char chars[] = bigNum.toString().toCharArray();
		
		for(int n = 0; n<chars.length; n++)
			sum += Character.digit(chars[n],10);
		
		System.out.println(sum);
	}
}
