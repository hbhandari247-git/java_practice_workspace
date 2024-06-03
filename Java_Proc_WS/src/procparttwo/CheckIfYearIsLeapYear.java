package procparttwo;

public class CheckIfYearIsLeapYear {
	public static void main(String[] args) {
		int year = 2400;
		System.out.println(checkIfLeapYear(year));
	}

	private static boolean checkIfLeapYear(int year) {
		// year to be checked
		boolean leap = false;

		// if the year is divided by 4
		if (year % 4 == 0) {

			// if the year is century
			if (year % 100 == 0) {

				// if year is divided by 400
				// then it is a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			}

			// if the year is not century
			else
				leap = true;
		}

		else
			leap = false;
		return leap;
	}
}