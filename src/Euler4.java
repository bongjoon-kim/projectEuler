/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Euler4 {

	public static void main(String[] args) {
		int Pnum = 0;
		int PnumMax = 0;
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 0; j--) {
				Pnum = i * j;
				if (isPalindromicNumber(Pnum)) {
					if (PnumMax <= Pnum) {
						PnumMax = Pnum;
					}
				}
			}
		}
		System.out.println(PnumMax);
		
	}
	
	public static boolean isPalindromicNumber(int num) {
		String str = String.valueOf(num);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i))
				return false;
		}
		return true;
	}

}
