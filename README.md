# dates
Common dates utilities.

# Spanish date format for day of year
The method `DateUtils.getDateFromDayNumber(day, isLeapYear)` returns Spanish date format for a day of the year.
```
System.Out.println(DateUtils.getDateFromDayNumber(60, false));
// Should print "1 de marzo"

System.Out.println(DateUtils.getDateFromDayNumber(60, true));
// Should print "29 de febrero"
```


