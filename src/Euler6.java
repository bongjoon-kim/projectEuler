/*
(1~10 까지의 합을 제곱한 수: 3025) - (1~10 까지의 각 자연수의 제곱의 합: 385)의 차는 2640 이다.
(1~100 까지의 합을 제곱한 수) - (1~100 까지의 각 자연수의 제곱의 합)의 차를 구하라  
 */

public class Euler6 {

	public static void main(String[] args) {
		long sum1 = 0L;
		long sum2 = 0L;
		
		for (int i = 1; i <= 100; i++) {
			sum1 += (i * i);
			sum2 += i; 
		}
		System.out.println("1~100까지의 제곱의 합: " + sum1);
		System.out.println("1~100까지의 합의 제곱: " + sum2 * sum2);
		
		System.out.println("위 두수의 차이 : " + (sum2 * sum2 - sum1));
	}

}
