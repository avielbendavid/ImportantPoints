package p4.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {
	public static void main(String[] args) {

		// TS- Time stamp - returns the TS from the system
		// returns the number of the seconds from 1/1/1970
		long ts = System.currentTimeMillis();
		System.out.println(ts);

		// java.util.Date *****************************************
		Date dateUtil = new Date();
		System.out.println(dateUtil);
		// Tue Feb 16 10:33:50 IST 2021 - toString is date&time

		// java.sql.Date *****************************************
		java.sql.Date dateSql = new java.sql.Date(ts);
		System.out.println(dateSql);
		// 2021-02-16 - toString is just the date

		// timestamp
		long ts1 = System.currentTimeMillis();
		System.out.println("time stamp");
		System.out.println(ts1);
		System.out.println("==================");

		// java.util.Date
		Date dateUtil1 = new Date();
		System.out.println("java.util.Date");
		System.out.println(dateUtil1);
		System.out.println("==================");

		// java.sql.Date format: yyyy-MM-dd
		java.sql.Date dateSql1 = new java.sql.Date(ts);
		System.out.println("java.sql.Date");
		System.out.println(dateSql1);
		System.out.println("==================");

		// java.util.Calendar - abstract class
		// java.util.GregorianCalendar - concrete class
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar");
		System.out.println(cal);
		cal.set(1980, Calendar.JANUARY, 25, 0, 0, 0);
		System.out.println(cal);

		System.out.println(cal.getTime());

		cal = new GregorianCalendar(1970, Calendar.MAY, 19);
		System.out.println(cal.getTime());
		System.out.println("==================");

		System.out.println("java.time - new API");
		// new API
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		dateTime = LocalDateTime.of(2020, 1, 25, 0, 0);
		System.out.println(dateTime);

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

	}
}
