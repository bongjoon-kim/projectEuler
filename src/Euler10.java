/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/
public class Euler10 {

	public static void main(String[] args) {
		long max = 2000000;
		long sum = 0;
		for (long i = 2; i <= max; i++) {
			if (isPrime(i))
				sum += i;
		}
		System.out.println(sum);

	}
	public static boolean isPrime(long num) {
		for(long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
