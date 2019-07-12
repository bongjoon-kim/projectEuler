/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
NOTE: Do not count spaces or hyphens. 
For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage. 
*/
public class Euler17 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			count += CharCount(NumToStr(i));
		}
		System.out.println(count);
	}
	public static int CharCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
				count++;
		}
		return count;
	}
	
	public static String NumToStr(int num) {
		int num1, num2;
		if(num == 1000) {
			return "one thousand";
		} else if(num > 99 && (num / 100) != 0) {
			num1 = num / 100;
			num2 = num % 100;
			if(num2 == 0)
				return NumName(num1) + " hundred";
			else
				return NumName(num1) + " hundred and " + NumName(num2);
		}else {
			num1 = 0;
			num2 = num;
			return NumName(num2);
		}
	}
	public static String NumName(int num) {
		if(num > 19) {
			return NumToStr2(num / 10) + " " + NumToStr1(num % 10);
		}else {
			return NumToStr1(num);
		}
	}
	
	public static String NumToStr1(int num) {
		String str;
		switch(num) {
		case 1:	str = "one";	break;
		case 2:	str = "two";	break;	
		case 3:	str = "three";	break;
		case 4:	str = "four";	break;
		case 5:	str = "five";	break;
		case 6:	str = "six";	break;
		case 7:	str = "seven";	break;
		case 8:	str = "eight";	break;
		case 9:	str = "nine";	break;
		case 10:	str = "ten";	break;
		case 11:	str = "eleven";	break;
		case 12:	str = "twelve";	break;	
		case 13:	str = "thirteen";	break;
		case 14:	str = "fourteen";	break;
		case 15:	str = "fifteen";	break;
		case 16:	str = "sixteen";	break;
		case 17:	str = "seventeen";	break;
		case 18:	str = "eighteen";	break;
		case 19:	str = "nineteen";	break;		
		default:	str = "";	break;
		}
		return str;
	}
	public static String NumToStr2(int num) {
		String str;
		switch(num) {
		//case 1:	str = "ten";	break;
		case 2:	str = "twenty";	break;	
		case 3:	str = "thirty";	break;
		case 4:	str = "forty";	break;
		case 5:	str = "fifty";	break;
		case 6:	str = "sixty";	break;
		case 7:	str = "seventy";	break;
		case 8:	str = "eighty";	break;
		case 9:	str = "ninety";	break;
		default:	str = "";	break;
		}
		return str;
	}	
}

