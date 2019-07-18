//Using names.txt (right click and 'Save Link/Target As...'), a 46K text file 
//containing over five-thousand first names, begin by sorting it into alphabetical order. 
//Then working out the alphabetical value for each name, multiply this value by 
//its alphabetical position in the list to obtain a name score.
//
//For example, when the list is sorted into alphabetical order, COLIN, 
//which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
//So, COLIN would obtain a score of 938 × 53 = 49714.
//
//What is the total of all the name scores in the file?

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Euler22 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		StringBuffer name = new StringBuffer();
		String nameTemp1 = null;
		String nameTemp2 = null;
		int sumOfScore = 0;
		
		//파일을 읽어서 arrayList에 담기
		try {
			fis = new FileInputStream("p022_names.txt");
			
			int readData = -1;
			while((readData = fis.read()) != -1) {
				if (readData >= 65 && readData <= 90) {
					name.append((char)readData);
				}				
				if (readData == 44) {
					arr.add(name.toString());
					name.setLength(0);
				}
			}
			arr.add(name.toString());	//마지막이름

	        fis.close(); //스트림 닫기
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//arrayList에 담은 문자열을 크기순으로 정열하여 다시 담기
		arr2.add(arr.get(0));	//0번
		for (int i = 1; i < arr.size(); i++) {
			nameTemp1 = arr.get(i);
			for(int j = 0; j < arr2.size(); j++) {
				nameTemp2 = arr2.get(j);
				if (compString(nameTemp1, nameTemp2).equals(nameTemp1)) {
					arr2.add(j,nameTemp1);
					break;
				}
				if (j == arr2.size()-1) {
					arr2.add(nameTemp1);
					break;
				}
			}
		}
		
		//파일저장: 확인용
		FileWriter fw;
		FileWriter fw1;
		try {
			fw = new FileWriter("p022_names2.txt");
			for(int j = 0; j < arr2.size(); j++) {
				fw.write(arr2.get(j) + "\n");
			}
			fw.close();
			
			fw1 = new FileWriter("p022_names3.txt");
			for(int j = 0; j < arr.size(); j++) {
				fw1.write(arr.get(j) + "\n");
			}			
			fw1.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//계산
		for (int i = 0; i < arr2.size(); i++) {
			sumOfScore += (score(arr2.get(i)) * (i + 1));
		}
		
		System.out.println(sumOfScore);
		
		System.out.println(arr2.get(937));
		System.out.println(score("COLIN"));
	}
	
	//두 문자열을 한글자씩 비교하여 작은값을 리턴
	public static String compString(String str1, String str2) {
		int iLoop = str1.length();
		String str = str1;
		
		if (str1.length() >= str2.length()) {
			iLoop = str2.length();
			str = str2;
		}
		
		for(int i = 0; i < iLoop; i++) {
			if(str1.charAt(i) > str2.charAt(i)) {
				return str2;
			}else if(str1.charAt(i) < str2.charAt(i)) {
				return str1;
			}
		}
		return str;
	}
	
	//문자열을 받아서 alphabetical value 계산(A:65 -> A:1)
	public static int score(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i) - 64);
		}
		return sum;
	}

}
