package by.itstep.gulik.model.logic;

public class ArrayEvenNumber4 {
    public static int areEvenOrOddNumbers(int[] array) {

        if (array == null || array.length <= 1) {
            return -1;
        }

        int even_count = 0;
        int odd_count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        return even_count & odd_count;
    }
}
