package net.dates;

/**
 * Provides date utilities.
 * @author meguia
 *
 */
public class DateUtils {
	
	private static final int JANUARY_INDEX = 0;
	private static final int FEBRUARY_INDEX = 1;

	private static final Month[] MONTHS = new Month[] {
		new Month("enero", 31),
		new Month("febrero", 59),
		new Month("marzo", 90),
		new Month("abril", 120),
		new Month("mayo", 151),
		new Month("junio", 181),
		new Month("julio", 212),
		new Month("agosto", 243),
		new Month("septiembre", 273),
		new Month("octubre", 304),
		new Month("noviembre", 334),
		new Month("diciembre", 365)
	};

	/**
	 * Accepts a day number and returns the date in Spanish.
	 * @param day day of the year, must be in year range.
	 * @param isLeap true if we want the date for a leap year. Otherwise, false.
	 * @return the date in "{@literal <day-of-month> de <spanish-month-name>}" format 
	 */
	public static String getDateFromDayNumber(final Integer day, final Boolean isLeap) {
		if (day <= 0 || ((!isLeap && day > 365) || day > 366)) {
			throw new IllegalArgumentException("day out of range");
		}
		
		// zero based month index
		int monthIndex = 0;
		while (day > getLastDayOfMonth(monthIndex, isLeap)) {
			monthIndex++;
		}
		
		Integer dayOfMonth = getDayOfMonth(day, monthIndex, isLeap);

		return dayOfMonth + " de " + MONTHS[monthIndex].getName();
	}

	/**
	 * Gets months last days. Adds a day for months after February 28th for leap years.
	 * @param isLeap
	 * @param monthIndex zero based month index
	 * @return the day that month ends
	 */
	private static int getLastDayOfMonth(int monthIndex, final Boolean isLeap) {
		Integer correction = 0;
		if (isLeap && monthIndex >= FEBRUARY_INDEX) {
			correction = 1;
		}

		return MONTHS[monthIndex].getLastDay() + correction;
	}
	

	/**
	 * Gets the date for the month provided. 
	 * @param day year day
	 * @param monthIndex month
	 * @param isLeap
	 * @return month date
	 */
	private static Integer getDayOfMonth(final Integer day, int monthIndex, final Boolean isLeap) {
		Integer dayOfMonth = day;
		if (monthIndex > JANUARY_INDEX) {
			dayOfMonth -= MONTHS[monthIndex - 1].getLastDay();
			if (isLeap && monthIndex > FEBRUARY_INDEX) {
				dayOfMonth -= 1;
			}
		}
		
		return dayOfMonth;
	}

}
