
public class Euler14 {

	public static void main(String[] args) {
		long maxCount = 10L;
		long numCount = 0L;
		long maxSeqNum = 0L;
		for(long i = 10; i <= 1000000; i++) {
			numCount = Collatz(i);
			if (maxCount < Collatz(i)) {
				maxCount = numCount;
				maxSeqNum = i;
			}
		}
		System.out.println(maxSeqNum);
	}
	public static long Collatz(long num) {
		long count = 1L;
		while(num > 1) {
			if (num % 2 == 0) {
				num = num/2;
			} else {
				num = 3*num + 1;
			}
			//System.out.print(num + "  ");
			count++;
		}
		return count;
	}

}
