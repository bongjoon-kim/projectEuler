import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Euler19b {

	public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(1901, Month.JANUARY, 1);
        int count = 0;
        while (localDate.get(ChronoField.YEAR) < 2001) { 
            if (localDate.getDayOfMonth() == 1 && localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                count++; 
            }
            localDate = localDate.plusDays(1);
        }
        System.out.println(count);

	}

}
