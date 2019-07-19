import java.util.ArrayList;

/* A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. 
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, 
 * which means that 28 is a perfect number.
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant 
 * if this sum exceeds n.
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number 
 * that can be written as the sum of two abundant numbers is 24. By mathematical analysis, 
 * it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. 
 * However, this upper limit cannot be reduced any further by analysis 
 * even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers 
 * is less than this limit.
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
*/
public class Euler23 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrAb = new ArrayList<>();
		int[] arrNum = new int[28124];
		int sum = 0;
		int sumOfAb = 0;
		
		// 1~28123 까지 루프를 돌면서 abundant number 확인하여 arrAb에 저장
		for (int i = 1; i < 28123; i++) {
			if(isAbundant(i))
				arrAb.add(i);
		}
		
		//확인용 배열에 양의 정수만 저장
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i;
		}
		
		//arrAb의 합을 확인하여 arrNum 에서 제거
		for(int i = 0; i < arrAb.size(); i++) {
			for(int j = 0; j < arrAb.size(); j++) {
				sum = arrAb.get(i) + arrAb.get(j);
				if (sum <= 28123)
					arrNum[sum] = 0;
			}
		}
		
		//남아있는 숫자의 합
		for (int i = 1; i <= 28123; i++) {
			sumOfAb += arrNum[i];
		}
		
		System.out.println(sumOfAb);
	}
	
	//abundant number 여부확인
	public static boolean isAbundant(int num) {
		if (num < sumOfDivisors(num))
			return true;
		else
			return false;
	}
	
	// 자기자신을 뺀 약수의 합
	public static int sumOfDivisors(int num) {
		int sum = 0;
		for(long i = 1; i <= (num/2); i++) {
			if (num % i == 0)
				sum += i;
		}
		return sum;
	}

}
