package by.itstep.gulik.model.logic;

public class ArrayPalindrom2 {
    public static boolean isArraySimmetrical(int[] array) {
        for (int i = 0, j=array.length-1; i < array.length / 2; i++, j--) {
            if (array[i] != array[j])
                return false;
        }
        return true;
    }
}
