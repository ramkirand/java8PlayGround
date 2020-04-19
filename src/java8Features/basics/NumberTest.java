package java8Features.basics;

import java.util.Comparator;
import java.util.List;

public class NumberTest {

	public int findSquareMaxOddMaxWithStreams(List<Integer> numbers) {
		return numbers.stream()
				.filter(NumberTest::isOddNumber)
				.filter(NumberTest::isGreaterThan3)
				.filter(NumberTest::isLessThan11)
				.max(Comparator.naturalOrder())
				.map(i -> i * i)
				.get();

	}

	public int findSquareMaxOddMax(List<Integer> numbers) {
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number % 2 != 0 && number > 3 && number < 11) {
				max = number;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isOddNumber(int n) {
		return n % 2 != 0;
	}

	public static boolean isGreaterThan3(int n) {
		return n > 3;
	}

	public static boolean isLessThan11(int n) {
		return n < 11;
	}

}
