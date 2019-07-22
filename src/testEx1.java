import java.util.HashSet;

public class testEx1 {

	public static void main(String[] args) {
		
		HashSet<Integer> abound = new HashSet<Integer>();
		HashSet<Integer> pairSums = new HashSet<Integer>();

		long start = System.currentTimeMillis();

		for (int i = 1; i <= 28123; i++) {
			int sum = 0;
			for (int d = 1; d < i; d++) {
				if (i % d == 0) {
					sum += d;
				}
			}

			if (sum > i) {
				for (int n : abound)
					pairSums.add(n + i);
				pairSums.add(i << 1);

				abound.add(i);
			}
		}

		long sum = 0;
		for (int i = 1; i <= 28123; i++) {
			if (!pairSums.contains(i))
				sum += i;
		}

		System.out.println(sum);

		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}
