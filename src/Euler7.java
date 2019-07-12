/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
*/
public class Euler7 {

	public static void main(String[] args) {
		int count = 1;
		int i = 2;
		while (count < 10001) {
			i++;
			if (isPrime(i))
				count++;
		}
		System.out.println("10001번째 소수 : " + i);
	}
	
	public static boolean isPrime(long num) {
		for(long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}	
}
