import java.util.ArrayList;
import java.util.Arrays;

/* 분자가 1인 분수를 단위분수라고 합니다. 분모가 2에서 10까지의 단위분수는 아래와 같습니다.
 * 1/6의 경우 순환마디는 "6"으로 0.166666...처럼 6이 무한히 반복됨을 뜻합니다. 
 * 같은 식으로 1/7은 6자리의 순환마디(142857)를 가집니다. (1/7 = 0.142857142857....)
 * d 를 1000 이하의 정수라고 할 때, 단위분수 1/d 의 순환마디가 가장 긴 수는 무엇입니까?
 * */
public class Euler26 {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		
		int numerator = 10;
		int denominator = 7;
		int remainder = 0;
		int maxDenominator = 0; 
		int maxCircle = 0;
		int circle = 0;
		
		for(denominator = 2; denominator <= 1000; denominator++) {
			arrList.clear();
			while(true) {
				if(numerator > denominator) {
					remainder = numerator % denominator;
					if (arrList.contains(remainder) || remainder == 0) break;
					arrList.add(remainder);
					numerator = remainder * 10;
				}else {
					numerator = numerator * 10;
				}
			}
			
			if(remainder != 0) {
				circle = findIndex(arrList, remainder);
				if (maxCircle < arrList.size()) {
					maxCircle = arrList.size();
					maxDenominator = denominator;
				}
			}
		}
		
		System.out.println(maxDenominator + ":" + maxCircle);
	}
	
	public static int findIndex (ArrayList<Integer> arrList, int num) {
		for(int i = 0; i < arrList.size(); i++) {
			if(num == arrList.get(i)) {
				return arrList.size() - i;
			}
		}
		return 0;
	}

}
