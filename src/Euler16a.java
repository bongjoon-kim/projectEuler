import java.math.BigInteger;

public class Euler16a {

	public static void main(String[] args) {
		long sum = 0;
		
		char chars[] = BigInteger.valueOf(2).pow(1000).toString().toCharArray();
		
		for(int n = 0; n<chars.length; n++)
			sum += Character.digit(chars[n],10);
		
		System.out.println(sum);

	}

}
