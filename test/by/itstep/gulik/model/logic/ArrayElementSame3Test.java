package by.itstep.gulik.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayElementSame3Test {

    @Test
    public void testArrayElementsEquals() {
        int[] numbers = {7, 7, 7, 7, 7, 7};
        boolean expected = true;

        boolean actual = ArrayElementSame3.areElementsEquals(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testArrayElementsEqualsNegative() {
        int[] numbers = {3, 7, 1, 8, 5};
        boolean expected = false;

        boolean actual = ArrayElementSame3.areElementsEquals(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testArryaElementsEqualsWithEmptyObject() {
        ArrayElementSame3.areElementsEquals(new int[0]);
    }

}
