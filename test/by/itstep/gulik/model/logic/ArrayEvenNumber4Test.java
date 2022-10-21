package by.itstep.gulik.model.logic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayEvenNumber4Test {

    @Test
    public void testEvenOrOddNumbers() {
        int[] numbers = {1, 2, 3, 4};
        int expected = 2;

        int actual = ArrayEvenNumber4.areEvenOrOddNumbers(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testEvenOrOddNumbersNegative() {
        int[] numbers = {-1, -2, -3};
        int expected = 0;

        int actual = ArrayEvenNumber4.areEvenOrOddNumbers(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testEvenOrOddNumbersWithEmptyObject() {
        ArrayEvenNumber4.areEvenOrOddNumbers(new int[0]);
    }

}
