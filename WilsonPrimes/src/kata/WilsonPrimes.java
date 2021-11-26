package kata;

import java.util.ArrayList;
import java.util.Arrays;

public class WilsonPrimes {
	/*
	 * Wilson primes satisfy the following condition. Let P represent a prime
	 * number.
	 * 
	 * Then ((P-1)! + 1) / (P * P) should give a whole number.
	 * 
	 * Your task is to create a function that returns true if the given number is a
	 * Wilson prime.
	 */

	static ArrayList<Double> WilsonNumbers = new ArrayList<>(Arrays.asList(3.0, 5.0, 563.0));

	public static boolean am_i_wilson(double n) {

		// Відомих лиш 3 числа Вільсона всі інші будуть за 10^13
		return WilsonNumbers.contains(n);

	}
}
