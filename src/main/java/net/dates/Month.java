package net.dates;

/**
 * Represents a month.
 * @author meguia
 *
 */
public class Month {
	
	private String name;
	private Integer lastDay;
	
	public Month(String name, Integer lastDay) {
		this.lastDay = lastDay;
		this.name = name;
	}

	/**
	 * @return month name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return month last day
	 */
	public Integer getLastDay() {
		return lastDay;
	}
	
}
