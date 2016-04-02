package net.dates;

/**
 * Represents a month.
 * @author meguia
 *
 */
public enum Month {
	JANUARY("enero", 31),
	FEBRUARY("febrero", 59),
	MARCH("marzo", 90),
	APRIL("abril", 120),
	MAY("mayo", 151),
	JUNE("junio", 181),
	JULY("julio", 212),
	AUGUST("agosto", 243),
	SEPTEMBER("septiembre", 273),
	OCTOBER("octubre", 304),
	NOVEMBER("noviembre", 334),
	DECEMBER("diciembre", 365),
	;

	private String nameInSpanish;
	private Integer lastDay;
	
	Month(String nameInSpanish, Integer lastDay) {
		this.nameInSpanish = nameInSpanish;
		this.lastDay = lastDay;
	}

	/**
	 * @return month name in spanish
	 */
	public String getNameInSpanish() {
		return nameInSpanish;
	}

	/**
	 * @return month last day
	 */
	public Integer getLastDay() {
		return lastDay;
	}
	
}
