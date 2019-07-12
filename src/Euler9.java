/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc. 
*/
public class Euler9 {

	public static void main(String[] args) {
		int a, b, c;
		for (a = 997; a > 2; a--) {
			for (b = 1000-a; b > 2;  b--) {
				c = 1000 - a - b;
				if (b <= c) { break; }
				if (c*c + b*b == a*a && c > 0)
					System.out.println(c + "+" + b + "+" + a + "=" + (a*b*c));
			}
		}

	}

}
