import java.math.BigDecimal;

/* 피보나치 수열에서 값이 처음으로 1000자리가 되는 것은 몇번째 항입니까?
 * F1 = 1 ~ F12 = 144
 * 수열의 값은 F12에서 처음으로 3자리가 됩니다.
 * */

public class Euler25 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		long count = 2;
		BigDecimal bigNum1 = new BigDecimal("1");
		BigDecimal bigNum2 = new BigDecimal("1");
		BigDecimal bigNum = new BigDecimal("0");
		
		BigDecimal bd = new BigDecimal("10");
		bd = bd.pow(999);
		
		while(bigNum.compareTo(bd) == -1) {
			bigNum = bigNum1.add(bigNum2);
			bigNum1 = bigNum2;
			bigNum2 = bigNum;
			count++;
		}
		
		System.out.println(count);
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간(밀리초):" + (endTime - startTime) );
	}

}
