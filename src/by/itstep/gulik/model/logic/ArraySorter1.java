package by.itstep.gulik.model.logic;

public class ArraySorter1 {


    public static boolean isArraySortedAscending(int[] array) {

        boolean sorted = true;

        if (array == null || array.length <= 1) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return sorted;
    }
}

