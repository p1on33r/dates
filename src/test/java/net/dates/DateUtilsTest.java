package net.dates;

import static org.junit.Assert.*;
import net.dates.DateUtils;

import org.junit.Test;

/**
 * Tests for DateUtils class.
 * @author meguia
 *
 */
public class DateUtilsTest {

	@Test(expected = IllegalArgumentException.class)
	public void testGetDateFromDayNumberOutOfRangeMinus1NotLeap() {
		DateUtils.getDateFromDayNumber(-1, false);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetDateFromDayNumberOutOfRange0NotLeap() {
		DateUtils.getDateFromDayNumber(0, false);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetDateFromDayNumberOutOfRangeMinus1Leap() {
		DateUtils.getDateFromDayNumber(-1, true);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetDateFromDayNumberOutOfRange0Leap() {
		DateUtils.getDateFromDayNumber(0, true);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetDateFromDayNumberOutOfRange366NotLeap() {
		DateUtils.getDateFromDayNumber(366, false);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetDateFromDayNumberOutOfRange1000NotLeap() {
		DateUtils.getDateFromDayNumber(1000, false);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetDateFromDayNumberOutOfRange367Leap() {
		DateUtils.getDateFromDayNumber(367, true);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetDateFromDayNumberOutOfRange1000Leap() {
		DateUtils.getDateFromDayNumber(1000, true);
	}
	
	@Test
	public void testGetDateFromDayNumber1DeEnero() {
		assertEquals("1 de enero", DateUtils.getDateFromDayNumber(1, false));
	}

	@Test
	public void testGetDateFromDayNumber1deFebrero() {
		assertEquals("1 de febrero", DateUtils.getDateFromDayNumber(32, false));
	}
	
	@Test
	public void testGetDateFromDayNumber28deFebrero() {
		assertEquals("28 de febrero", DateUtils.getDateFromDayNumber(59, false));
	}
	
	@Test
	public void testGetDateFromDayNumber1deMarzo() {
		assertEquals("1 de marzo", DateUtils.getDateFromDayNumber(60, false));
	}
	
	@Test
	public void testGetDateFromDayNumberProgrammersDay() {
		assertEquals("13 de septiembre", DateUtils.getDateFromDayNumber(256, false));
	}
	
	@Test
	public void testGetDateFromDayNumber1deDiciembre() {
		assertEquals("1 de diciembre", DateUtils.getDateFromDayNumber(335, false));
	}
	
	@Test
	public void testGetDateFromDayNumber31deDiciembre() {
		assertEquals("31 de diciembre", DateUtils.getDateFromDayNumber(365, false));
	}
	
	@Test
	public void testGetDateFromDayNumberLeap1DeEnero() {
		assertEquals("1 de enero", DateUtils.getDateFromDayNumber(1, true));
	}

	@Test
	public void testGetDateFromDayNumberLeap1deFebrero() {
		assertEquals("1 de febrero", DateUtils.getDateFromDayNumber(32, true));
	}
	
	@Test
	public void testGetDateFromDayNumberLeap28deFebrero() {
		assertEquals("28 de febrero", DateUtils.getDateFromDayNumber(59, true));
	}
	
	@Test
	public void testGetDateFromDayNumberLeap29deFebrero() {
		assertEquals("29 de febrero", DateUtils.getDateFromDayNumber(60, true));
	}
	
	@Test
	public void testGetDateFromDayNumberLeap1deMarzo() {
		assertEquals("1 de marzo", DateUtils.getDateFromDayNumber(61, true));
	}
	
	@Test
	public void testGetDateFromDayNumberLeapProgrammersDay() {
		assertEquals("12 de septiembre", DateUtils.getDateFromDayNumber(256, true));
	}
	
	@Test
	public void testGetDateFromDayNumberLeap1deDiciembre() {
		assertEquals("1 de diciembre", DateUtils.getDateFromDayNumber(336, true));
	}
	
	@Test
	public void testGetDateFromDayNumberLeap31deDiciembre() {
		assertEquals("31 de diciembre", DateUtils.getDateFromDayNumber(366, true));
	}
	
}
