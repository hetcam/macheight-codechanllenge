package macheight.code.challenge;

import macheight.code.challenge.model.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class PairCalculatorTests {

	@Test
	void validateEmptyList() {
		List<Integer> numbers = List.of();
		int targetSum = 10;
		Assertions.assertEquals(0, PairCalculator.findSumPairs(numbers, targetSum).size());
	}

	@Test
	void validateNegatives() {
		List<Integer> numbers = List.of(2, -4, 5, -3, 6, -8, -9);
		int targetSum = 2;
		List<Pair> result = PairCalculator.findSumPairs(numbers, targetSum);
		Assertions.assertEquals( 2, result.size());

		Assertions.assertEquals( -3, result.get(0).getNum1());
		Assertions.assertEquals( 5, result.get(0).getNum2());
		Assertions.assertEquals( 6, result.get(1).getNum1());
		Assertions.assertEquals( -4, result.get(1).getNum2());
	}

	@Test
	void validateTargetSumZero() {
		List<Integer> numbers = List.of(2, -4, 4, -3, 6, -8, -9);
		int targetSum = 0;
		List<Pair> result = PairCalculator.findSumPairs(numbers, targetSum);
		Assertions.assertEquals( 1, result.size());
		Assertions.assertEquals( 4, result.get(0).getNum1());
		Assertions.assertEquals( -4, result.get(0).getNum2());
	}

	@Test
	void validateExampleTest() {
		List<Integer> numbers = List.of(1, 9, 5, 0, 20, -4, 12, 16, 7);
		int targetSum = 12;
		List<Pair> result = PairCalculator.findSumPairs(numbers, targetSum);
		Assertions.assertEquals( 3, result.size());

		Assertions.assertEquals( 12, result.get(0).getNum1());
		Assertions.assertEquals( 0, result.get(0).getNum2());

		Assertions.assertEquals( 16, result.get(1).getNum1());
		Assertions.assertEquals( -4, result.get(1).getNum2());

		Assertions.assertEquals( 7, result.get(2).getNum1());
		Assertions.assertEquals( 5, result.get(2).getNum2());

	}

}
