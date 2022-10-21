package by.itstep.gulik.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySorter1Test {


    @Test
    public void testArraySortedAscending() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        boolean expected = true;

        boolean actual = ArraySorter1.isArraySortedAscending(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testArraySortedAscendingNegative() {
        int[] numbers = {3, 7, 1, 8, 5};
        boolean expected = false;

        boolean actual = ArraySorter1.isArraySortedAscending(numbers);

        assertEquals(expected, actual);

    }

    @Test
    public void testArraySortedAscendingWithEmptyObject() {
        ArraySorter1.isArraySortedAscending(new int[0]);
    }

}

