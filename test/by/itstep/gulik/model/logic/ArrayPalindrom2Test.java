package by.itstep.gulik.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPalindrom2Test {

    @Test
    public void testArryaSimmetrical() {
        int[] numbers = {1, 2, 3, 3, 2, 1};
        boolean expected = true;

        boolean actual = ArrayPalindrom2.isArraySimmetrical(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testArryaSimmetricalNegative() {
        int[] numbers = {3, 7, 1, 8, 5};
        boolean expected = false;

        boolean actual = ArrayPalindrom2.isArraySimmetrical(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testArryaSimmetricalWithEmptyObject() {
        ArrayPalindrom2.isArraySimmetrical(new int[0]);
    }


    @Test(expected = RuntimeException.class)
    public void testArryaSimmetricalWithNull() {
        ArrayPalindrom2.isArraySimmetrical(null);
    }
}
