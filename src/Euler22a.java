import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Euler22a {

	public static void main(String[] args) {

		String [] nameList = new String[6000];
		BufferedReader fi;
		try {
			fi = new BufferedReader(new FileReader("D:/00-job/p022_names.txt"));
			try {
				nameList = fi.readLine ().replaceAll ("\"", "").split (",");
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Arrays.sort (nameList);

		long total = 0;
		for (int loop = 0; loop < nameList.length; loop++){
			total += getNameValue (nameList [loop]) * (loop + 1);
		}
		System.out.println ("Total value: " + total);
	}

	private static long getNameValue (String name) {

		long total = 0;

		for (int loop = 0; loop < name.length (); loop++)
			total += (int) name.charAt (loop) - 64;
		return total;
	}
}
