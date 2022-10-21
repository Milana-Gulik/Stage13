package by.itstep.gulik.model.logic;

public class ArrayExtremeValues {
    public static double max(double[] array) {

        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static double min(double[] array) {

        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static double avg(double[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        double s = 0;
        for (double number : numbers) {
            s += number;
        }

        return s / numbers.length;
    }

    public static double calcArrayOfOrderChanges(double[] array) {

        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        int min = 0;
        int max = 0;
        int temp;

        for (int i = 0; i < array.length; i++) {
//            array[i] += 1;
            if (array[min] > array[i])
                min = i;
            if (array[max] < array[i])
                max = i;
        }

        temp = (int) array[min];
        array[min] = array[max];
        array[max] = temp;

        return temp;
    }

    public static double sumOfTheSequence(double[] array) {

        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    public static double multiplicationOfTheSequence(double[] array) {

        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        double multiplication = 1;

        for (int i = 0; i < array.length; i += 2) {
            multiplication *= array[i];
        }
        return multiplication;
    }
}

