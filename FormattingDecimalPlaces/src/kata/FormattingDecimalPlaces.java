package kata;

public class FormattingDecimalPlaces {

	/*
	 * Each number should be formatted that it is rounded to two decimal places. You
	 * don't need to check whether the input is a valid number because only valid
	 * numbers are used in the tests.
	 */

	public static double TwoDecimalPlaces(double number) {
    
		String TempVal = String.format("%.2f", number);

		double result = Double.parseDouble(TempVal);

		return result;

	}

}
