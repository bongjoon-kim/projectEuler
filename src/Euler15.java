/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?

(0,0) -> (a,b) 경로의 수 : (a+b)!/(a!*b!)    
격자수에 다라 Pascal Triangel 형태를 보임
1
1 1
1 2 1 --> 2 (1x1)
1 3 3 1
1 4 6 4 1 --> 6	(2X2)
1 5 10 10 5 1
1 6 15 20 15 6 1  --> 20 (3X3)
*/
public class Euler15 {

	public static void main(String[] args) {
		double a = 20L;
		double b = 20L;

		System.out.println(factoial(a+b)/(factoial(a)*factoial(b)));
	}
	public static double factoial(double num) {
		double result = 1L;
		for (double i = 2; i <= num; i++) {
			result *= i;
		}
		return result;
	}

}
