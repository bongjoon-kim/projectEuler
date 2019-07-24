/*A permutation is an ordered arrangement of objects. 
 * For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. 
 * If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. 
 * The lexicographic permutations of 0, 1 and 2 are:
	012   021   102   120   201   210
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */

import java.util.Arrays;

public class Euler24 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		String[] arr = new String[10*9*8*7*6*5*4*3*2*1];
		int i = 0;
		
		for(int i0 = 0; i0 < 10; i0++) {
			for(int i1 = 0; i1 < 10; i1++) {
				if(i1 == i0)	continue;
				for(int i2 = 0; i2 < 10; i2++) {
					if(i2 == i0 || i2 == i1)	continue;
					for(int i3 = 0; i3 < 10; i3++) {
						if(i3 == i0 || i3 == i1 || i3 == i2)	continue;
						for(int i4 = 0; i4 < 10; i4++) {
							if(i4 == i0 || i4 == i1 || i4 == i2 || i4 == i3)	continue;
							for(int i5 = 0; i5 < 10; i5++) {
								if(i5 == i0 || i5 == i1 || i5 == i2 || i5 == i3 || i5 == i4)	continue;
								for(int i6 = 0; i6 < 10; i6++) {
									if(i6 == i0 || i6 == i1 || i6 == i2 || i6 == i3 || i6 == i4 || i6 == i5)	continue;
									for(int i7 = 0; i7 < 10; i7++) {
										if(i7 == i0 || i7 == i1 || i7 == i2 || i7 == i3 || i7 == i4 || i7 == i5 || i7 == i6)	continue;
										for(int i8 = 0; i8 < 10; i8++) {
											if(i8 == i0 || i8 == i1 || i8 == i2 || i8 == i3 || i8 == i4 || i8 == i5 || i8 == i6 || i8 == i7)	continue;
											for(int i9 = 0; i9 < 10; i9++) {
												if(i9 == i0 || i9 == i1 || i9 == i2 || i9 == i3 || i9 == i4 || i9 == i5 || i9 == i6 || i9 == i7 || i9 == i8)	continue;
												arr[i] = "" + i0 + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9;
												i++;
											}
										}
									}
								}
							}
						}
					}
					
				}
			}
		}
		
		Arrays.sort (arr);
		System.out.println(arr[999999]);
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간(밀리초):" + (endTime - startTime) );		
	}

}
