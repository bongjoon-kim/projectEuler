/*
1900.1.1 월요일  / 1,3,5,7,8,10,12월 : 31일 / 4,6,9,11 : 30일
2월은 28일 - 윤년엔 29일 - 유년은 4로 나눠지는 해 윤년. 예외) 100으로 나눠지면 평년. 400으로 나눠지면 윤년
1901.1.1 ~ 2000.12.31 사이에  1일이 일요일은 날은 몇번인가? 
 */
public class Euler19 {
	public static void main(String[] args) {
		int weekday = 1;	//monday
		int sCount = 0;
		
		for(int year = 1900; year < 2001; year++) {
			for(int month = 1; month < 13; month++) {
				weekday += monthday(year, month);
				if(year > 1900 && weekday % 7 == 0)
					sCount ++;
			}
		}
		System.out.println(sCount);
	}
	
	public static int monthday(int year, int month) {
		int day;
		switch (month) {
		case 2:
			day = leafday(year);	break;
		case 4: case 6: case 9: case 11:
			day = 30;	break;
		default:	
			day = 31;	break;
		}
		return day;
	}
	
	//2월의 일수확인
	public static int leafday(int yNum) {
		if (yNum % 400 == 0)
			return 29;
		else if (yNum % 100 == 0)
			return 28;
		else if (yNum % 4 == 0)
			return 29;
		else
			return 28;
	}
}
