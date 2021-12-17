package gep;

import java.util.Arrays;

public class GapInPrimes {
	public static long[] gap(int g, long m, long n) {

		long[] primes = generator(m, n);
		for (int i = 0; i < primes.length - 1; i++) {
			if (primes[i] >= m && primes[i] == primes[i + 1] - g) {
				return Arrays.copyOfRange(primes, i, i + 2);
			}
		}
		return null;
	}

	private static long[] generator(long m, long n) {
		long[] primes = new long[(int) (n - m)];
		int numPrimes = 0;
		boolean prime = true;
		for (int i = (int) m; i < (int) n; i++) {
			prime = true;
			for (int j = 2; j < Math.sqrt((double) i) + 1; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				primes[numPrimes] = (long) i;
				numPrimes++;
			}
		}
		return Arrays.copyOfRange(primes, 0, numPrimes);
	}

}
