/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Euler5 {

	public static void main(String[] args) {
		int sNum = 2520;
		boolean b = false;
		do {
			sNum ++;
			b = isMultipleNumber(sNum);
		} while (!b);
		
		System.out.println(sNum);
	}
	
	public static boolean isMultipleNumber(int num) {
		for (int i = 2; i <= 20; i++) {
			if (num % i != 0)
				return false;
		}
		return true;
	}

}
