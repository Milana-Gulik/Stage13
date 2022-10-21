package by.itstep.gulik.model.logic;

public class ArrayElementSame3 {
    public static boolean areElementsEquals(int[] array) {

        if (array == null || array.length <= 1) {
            return true;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[0] != array[i])
                return false;
        }

        return true;
    }
}

