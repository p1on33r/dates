package net.dates;

public class SpanishDate {

	public static void main(String[] args) {
		Integer dayOfYear = null;
		Boolean isLeap = null;
		
		Boolean parseOk = args.length == 2 && (args[1].equals("true") || args[1].equals("false"));
		try {
			
			dayOfYear = Integer.parseInt(args[0]);
			isLeap = Boolean.parseBoolean(args[1]);
		} catch (Exception e) {
			parseOk = false;
		}
		
		if (parseOk) {
			try {
				System.out.println(DateUtils.getDateFromDayNumber(dayOfYear, isLeap));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Usage:");
			System.out.println("$ java -cp dates.jar net.dates.SpanishDate <day of year> <isLeap>");
			System.out.println("<day of year> is the number of the day in year range.");
			System.out.println("<isLeap> indicates if it is a leap year. Possible values are 'true' or 'false'");
		}
		
		System.exit(0);
	}

}
