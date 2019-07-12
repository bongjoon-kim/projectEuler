// 600851475143 의 약수중 최대소수를 구하라 : 6857

import java.util.Scanner;

public class Euler3 {

	public static void main(String[] args) {
		long inNum;
		Scanner sc = new Scanner(System.in);
		inNum = sc.nextLong();

		System.out.print(inNum + " 의 약수중 최대소수 : " + Numfactor(inNum));
		
		sc.close();
		
	}
	private static long Numfactor(long num) {
		long max = 2L;
		for(long i = 2L; i < (num/2); i++) {
			if (num % i == 0) {
				max = num / i;
				if (isPrime(max)) {
					return max;
				}
			}
		}
		return num;
	}
	public static boolean isPrime(long num) {
		for(long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}