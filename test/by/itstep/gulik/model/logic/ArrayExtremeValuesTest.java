package by.itstep.gulik.model.logic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayExtremeValuesTest {

    private double[] array;

    @Test
    public void testMaxNumber() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double expected = 7.0;

        double actual = ArrayExtremeValues.max(numbers);

        assertEquals(expected, actual, 0);

    }

    @Test
    public void testMaxNumberNegative() {
        double[] numbers = {-1, -2, -3, -4, -5, -6, -7};
        double expected = -1;

        double actual = ArrayExtremeValues.max(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testMaxNumberWithNull() {
        ArrayExtremeValues.max(null);
    }

    @Test
    public void testMinNumber() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double expected = 1;

        double actual = ArrayExtremeValues.min(numbers);

        assertEquals(expected, actual, 0);

    }

    @Test
    public void testMinNumberNegative() {
        double[] numbers = {-1, -2, -3, -4, -5, -6, -7};
        double expected = -1;

        double actual = ArrayExtremeValues.max(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testMinNumberWithNull() {
        ArrayExtremeValues.max(null);
    }

    @Test
    public void testAvgNumber() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double expected = 4.0;

        double actual = ArrayExtremeValues.avg(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testAvgNumberNegative() {
        double[] numbers = {-1, -2, -3, -4, -5, -6, -7};
        double expected = -4.0;

        double actual = ArrayExtremeValues.avg(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCalcArrayOfOrderChanges() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double expected = 1.0;

        double actual = ArrayExtremeValues.calcArrayOfOrderChanges(numbers);

        assertEquals(expected, actual, 0);
    }


    @Test
    public void testCalcArrayOfOrderChangesNegative() {
        double[] numbers = {-1, -2, -3, -4, -5, -6, -7};
        double expected = -7.0;

        double actual = ArrayExtremeValues.calcArrayOfOrderChanges(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCalcArrayOfOrderChangesWithNull() {
        ArrayExtremeValues.calcArrayOfOrderChanges(null);
    }

    @Test
    public void testSumOfTheSequence() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double expected = 28.0;

        double actual = ArrayExtremeValues.sumOfTheSequence(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSumOfTheSequenceNegative() {
        double[] numbers = {-1, -2, -3, -4, -5, -6, -7};
        double expected = -28.0;

        double actual = ArrayExtremeValues.sumOfTheSequence(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testSumOfTheSequenceWithNull() {
        ArrayExtremeValues.sumOfTheSequence(null);
    }

    @Test
    public void testMultiplicationOfTheSequence() {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double expected = 105.0;

        double actual = ArrayExtremeValues.multiplicationOfTheSequence(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testMultiplicationOfTheSequenceNegative() {
        double[] numbers = {-1, -2, -3, -4, -5, -6, -7};
        double expected = 105.0;

        double actual = ArrayExtremeValues.multiplicationOfTheSequence(numbers);

        assertEquals(expected, actual, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testMultiplicationOfTheSequenceWithNull() {
        ArrayExtremeValues.multiplicationOfTheSequence(null);
    }

}



