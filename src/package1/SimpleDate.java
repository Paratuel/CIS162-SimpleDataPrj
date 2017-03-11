/********************************************************************
*This class creates a SimpleDate 
* 
* @author Patrick Dishaw
* @version 9/6/2013
*********************************************************************/

package package1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleDate {
	
	/** This represents the minimal year 
	 * allowed in the SimpleDate class */
	private int MIN_YEAR = 1753;
	
	/** This represents a month in the SimpleDate class */
	private int CurrentDay;
	
	/** This represents a day in the SimpleDate class */
	private int CurrentMonth;
	
	/** This represents a year in the SimpleDate class */
	private int CurrentYear;
	
	/** This array is used for the method ordinalDate to determine
	 * 	the number of days  before the month. Ex:
	 *  February = OrdinalArray[2] = 31 from the 31 days in January*/
	private static int[] OrdinalArray = 
	{0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	
	/**This array is used to check if any input days 
	 * are correct dates within the given month	 */
	private static int[] MonthLength =
	{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	/**Thus array is used to out.print 
	 * the correct month in toString method	 */
	private static String[] MonthNames =
	{ null, "January", "February", "March", "April", "May", 
		"June", "July", "August", "September", "October", 
		"November", "December"};
	
	/**This integer increases by one very time a SimpleDate is made*/
	static int count = 0;

	/****************************************************************
	 * The following method resets count to zero every time a new
	 * test is run
	 *
	 * @param count 
	 ****************************************************************/
	public static void reset() {
		count = 0;
	}
	
	/****************************************************************
	 * The following method is the default constructor that sets
	 * SimpleDate to zero
	 *
	 ****************************************************************/
	public SimpleDate() {
		CurrentDay = 0;
		CurrentMonth = 0;
		CurrentYear = 0;
		count += 1;
	}

	/****************************************************************
	 * The following method is a constructor that initializes the
	 * instance variables with the provided values
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @throws IllegalArgumentException when day or month < 0,
	 * year < MIN_YEAR, or day > the length of the input month,
	 * or month > 12
	 ****************************************************************/
	public SimpleDate(int day, int month, int year) {
		CurrentDay = day;
		CurrentMonth = month;
		CurrentYear = year;
		count += 1;
		//checking for correct date
		if(day < 1){
			throw new IllegalArgumentException();
		}
		
		if(month < 1){
			throw new IllegalArgumentException();
		}
		
		if(month > 12){
			throw new IllegalArgumentException();
		}
		
		if(year < MIN_YEAR){
			throw new IllegalArgumentException();
		}
		
		if(month == 2 && day == 29 
			&& isLeapYear(year) != true){
			throw new IllegalArgumentException();
		}
		
		if(CurrentDay > 29 && CurrentMonth == 2
				&& isLeapYear(CurrentYear) == true){
			throw new IllegalArgumentException();
		}
		
		if(day > MonthLength[month] && month != 2 && day != 29
				&& isLeapYear(year) != true){
			throw new IllegalArgumentException();
		}
	}
	
	/****************************************************************
	 * The following method is a constructor that initializes the 
	 * instance variables with the other SimpleDate parameter
	 *
	 * @param other
	 * @throws IllegalArgumentException when day or month < 0,
	 * year < MIN_YEAR, or day > the length of the input month,
	 * or month > 12
	 ****************************************************************/
	public SimpleDate(SimpleDate other) {
		CurrentDay = other.CurrentDay;
		CurrentMonth = other.CurrentMonth;
		CurrentYear = other.CurrentYear;
		count += 1;
		//checking for correct date
		if(CurrentDay < 0){
			throw new IllegalArgumentException();
		}
				
		if(CurrentMonth < 0){
			throw new IllegalArgumentException();
		}
		
		if(CurrentMonth > 12){
			throw new IllegalArgumentException();
		}
				
		if(CurrentYear < MIN_YEAR){
			throw new IllegalArgumentException();
		}
					
		if(CurrentMonth == 2 && CurrentDay == 29 
			&& isLeapYear(CurrentYear) != true){
			throw new IllegalArgumentException();
		}
		
		if(CurrentDay > 29 && CurrentMonth == 2
				&& isLeapYear(CurrentYear) == true){
			throw new IllegalArgumentException();
		}
		
		if(CurrentDay > MonthLength[CurrentMonth] && CurrentMonth != 2
			&& CurrentDay != 29 && isLeapYear(CurrentYear) != true){
			throw new IllegalArgumentException();
		}
	}
	
	/****************************************************************
	 * The following method is a constructor that accepts a string as
	 * a date with the following format: "day/month/year"
	 *
	 * @param startDate
	 * @throws IllegalArgumentException when day or month < 0,
	 * year < MIN_YEAR, or day > the length of the input month,
	 * or month > 12
	 ****************************************************************/
	public SimpleDate(String startDate) {
		
		String[] parts = startDate.split("/");
		if (parts.length < 3){
			throw new IllegalArgumentException();
		}
		CurrentMonth = Integer.parseInt(parts[0]);
		CurrentDay = Integer.parseInt(parts[1]);
		CurrentYear = Integer.parseInt(parts[2]);
		count += 1;

		//checking for correct date
		if(CurrentDay < 0){
			throw new IllegalArgumentException();
		}
				
		if(CurrentMonth < 0){
			throw new IllegalArgumentException();
		}
		
		if(CurrentMonth > 12){
			throw new IllegalArgumentException();
		}
				
		if(CurrentYear < MIN_YEAR){
			throw new IllegalArgumentException();
		}
					
		if(CurrentMonth == 2 && CurrentDay == 29 
			&& isLeapYear(CurrentYear) != true){
			throw new IllegalArgumentException();
		}
		
		if(CurrentDay > 29 && CurrentMonth == 2
				&& isLeapYear(CurrentYear) == true){
			throw new IllegalArgumentException();
		}
		
		if(CurrentDay > MonthLength[CurrentMonth] && CurrentMonth != 2
			&& CurrentDay != 2 && isLeapYear(CurrentYear) != true){
			throw new IllegalArgumentException();
		}
	}
	
	/****************************************************************
	 * The following method compares the day, month, 
	 * and year of the other object with CurrentDay,
	 * CurrentMonth, and CurrentYear
	 * 
	 * @param other
	 * @return true if the other object equals the "this" SimpleDate
	 ****************************************************************/
	public boolean equals(SimpleDate other) {
		
		if(CurrentDay != other.CurrentDay)
			return false;
		
		if(CurrentMonth != other.CurrentMonth)
			return false;
		
		if(CurrentYear != other.CurrentYear)
			return false;
		else
			return true;
	}
	
	/****************************************************************
	 * The following method uses the .equals method to determine 
	 * if SimpleDate s1 is the exact same as SimpleDate s2
	 *
	 * @param s1
	 * @param s2
	 * @return true if s1 equals s2
	 ****************************************************************/
	public static boolean equals(SimpleDate s1, SimpleDate s2){
		return s1.equals(s2);
	}
	
	/****************************************************************
	 * The following method compares the "this" SimpleDate and 
	 * "other" SimpleDate
	 *
	 * @param other
	 * @return 1 if the "this" SimpleDate is greater than the "other" 
	 * SimpleDate, -1 if it is less, and 0 if it is equal
	 ****************************************************************/
	public int compareTo(SimpleDate other){
		if (CurrentYear > other.CurrentYear)
			return 1;
		if (CurrentYear < other.CurrentYear)
			return -1;
		
		if (CurrentMonth > other.CurrentMonth)
			return 1;
		if (CurrentMonth < other.CurrentMonth)
			return -1;
		
		if (CurrentDay > other.CurrentDay)
			return 1;
		if (CurrentDay < other.CurrentDay)
			return -1;
		else
			return 0;
	}
	
	/****************************************************************
	 * The following method takes the int CurrentYear and checks to
	 * see if it is a leap year
	 *
	 *@return true when year is a leap year otherwise false.
	 ****************************************************************/
	public boolean isLeapYear() {
		if(CurrentYear % 4 == 0 && CurrentYear % 100 != 0 
			|| CurrentYear % 400 == 0)
			return true;
		else
			return false;
	}

	/****************************************************************
	 * The following method takes the give int year and checks to
	 * see if it is a leap year
	 *
	 *@param year
	 *@return true when year is a leap year otherwise false.
	 ****************************************************************/	
	public static boolean isLeapYear(int year) {
		if(year% 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		else
			return false;
	}

	/****************************************************************
	 * The following method returns the number of days since 
	 * the beginning of the CurrentYear to the CurrentDay
	 *
	 *@return the number of days that have passed
	 ****************************************************************/
	public int ordinalDate() {
		
		int OrdinalDate = CurrentDay;
		
		if(isLeapYear(CurrentYear) && CurrentMonth > 2)
			OrdinalDate += OrdinalArray[CurrentMonth] + 1;
		else
			OrdinalDate += OrdinalArray[CurrentMonth];
		return OrdinalDate;
		
	}
	
	/****************************************************************
	 * The following method increments the “this” SimpleDate by 1 day
	 * 
	 ****************************************************************/
	public void increment() {
		if(CurrentDay == 29 && CurrentMonth == 2){
			CurrentDay = 1;
			CurrentMonth += 1;
		}
		else if(CurrentDay == MonthLength[CurrentMonth] && CurrentMonth == 2
				&& isLeapYear(CurrentYear) == true){
			CurrentDay = 29;
		}
		else if(CurrentDay == MonthLength[CurrentMonth] 
				&& CurrentMonth == 12){
			CurrentDay = 1;
			CurrentMonth = 1;
			CurrentYear += 1;
		}
		else if(CurrentDay == MonthLength[CurrentMonth]){
			CurrentDay = 1;
			CurrentMonth += 1;
		}
		else
			CurrentDay += 1;
	}
	
	/****************************************************************
	 * The following method decrements the “this” SimpleDate by 1 day
	 *
	 ****************************************************************/	
	public void decrement() {
		if(CurrentDay == 1 && CurrentMonth == 3 
				&& isLeapYear(CurrentYear) == true){
			CurrentDay = 29;
			CurrentMonth -= 1;
		}
		else if(CurrentDay == 1 && CurrentMonth == 1){
			CurrentDay = 31;
			CurrentMonth = 12;
			CurrentYear -= 1;
		}
		else if(CurrentDay == 1 && CurrentMonth != 1){
			CurrentMonth -= 1;
			CurrentDay = MonthLength[CurrentMonth];
		}
		else
			CurrentDay -= 1;
	}

	/****************************************************************
	 * The following method that returns a string that represents a 
	 * SimpleDate with the following format:  “Day Month Year”.
	 *
	 *@return Date as a string
	 ****************************************************************/
	public String toString() {
		String sDay = "";
		String sMonth = "";
		
		if(CurrentDay < 10)
			sDay = "0" + CurrentDay;
		else
			sDay = "" + CurrentDay;

		sMonth = MonthNames[CurrentMonth];
		
		return sDay + " " + sMonth + " " + CurrentYear;
		
	}

	/****************************************************************
	 * The following method returns the int count
	 *
	 * @return count, which counts the number of 
	 * SimpleDate objects that have been created
	 ****************************************************************/
	public static int getNumberOfSimpleDates() {
		return count;
	}
	
	/****************************************************************
	 * The following method that the “this” SimpleDate to a file 
	 *
	 * @param Filename
	 ****************************************************************/	
	public void save (String Filename) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(Filename)));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		out.println(CurrentDay + " " + CurrentMonth + " " + CurrentYear);
		out.close(); 
	}
	
	/****************************************************************
	 * The following method that loads the “this” SimpleDate object
	 * from a file
	 *
	 * @param Filename
	 ****************************************************************/
	public void load(String Filename){
		Scanner fileReader = null;
		try{
			// open the data file
			fileReader = new Scanner(new File(Filename)); 
			// read one String in of data and an int
			CurrentDay = fileReader.nextInt();
			CurrentMonth = fileReader.nextInt();
			CurrentYear = fileReader.nextInt();
			System.out.println (CurrentDay + "/" + CurrentMonth + "/" + CurrentYear);
		}
			// could not find file
		catch(FileNotFoundException error) {
			System.out.println("File not found ");
		}
			// problem reading the file
		catch(Exception error){
			System.out.println("Oops!  Something went wrong.");
		}
		finally{
			if (fileReader != null)
			fileReader.close();
		}
	}
	
	/****************************************************************
	 * The following method returns a new SimpleDate object 
	 * representing the date “n” days from now. If  “n” is negative,
	 * then return the date “n” days in the past.
	 *
	 * @param n 
	 * @throws IllegalArgumentException when n == 0
	 * @return the new SimpleDate
	 ****************************************************************/
	public SimpleDate daysFromNow(int n) 
			throws IllegalArgumentException {
		SimpleDate FromNow = 
			new SimpleDate(CurrentDay, CurrentMonth, CurrentYear);
		if(n > 0){
			for(int i = 0; i < n; i++) {
				FromNow.increment();
			}
		}
		if(n < 0){
			for(int i = 0; i < n; i++){
				FromNow.decrement();
			}
		}
		if(n == 0){
			throw new IllegalArgumentException();
		}
		
		return FromNow;
	}
	
	/****************************************************************
	 * The following method returns the number of days from "this"
	 * SimpleDate to "other" SimpleDate. If "this" SimpleDate is
	 * less than "other" SimpleDate, the number is returned negative
	 *
	 * @param other
	 * @return the number of days that have elapsed from “this” 
	 * simpleDate to “other” simpleDate.
	 ****************************************************************/
	public int daysSince(SimpleDate other){
		int daysSinceCount = 0;
		
		SimpleDate CurrentDate = 
		new SimpleDate(CurrentDay, CurrentMonth, CurrentYear);
		
		if(CurrentDate.compareTo(other) == 1){
			while(CurrentDate.equals(other) != true){
				other.increment();
				daysSinceCount -= 1;
			}
		}
		
		else if(CurrentDate.compareTo(other) == -1){
			while(CurrentDate.equals(other) != true){
				CurrentDate.increment();
				daysSinceCount += 1;
			}
		}
		return daysSinceCount;
	}
}
