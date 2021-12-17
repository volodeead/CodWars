import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
	public static int[] divisibleBy(int[] numbers, int divider) {

		/*
		 * Complete the function which takes two arguments and returns all numbers which
		 * are divisible by the given divisor. First argument is an array of numbers and
		 * the second is the divisor.
		 * 
		 * Example divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
		 */

		List<Integer> tempArray = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				tempArray.add(numbers[i]);
			}
		}

		int[] result = tempArray.toArray();

//		for (int i = 0; i < result.length; i++)
//			result[i] = TempArray.get(i);
		
		

		return result;

	}
}