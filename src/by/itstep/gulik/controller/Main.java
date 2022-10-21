package by.itstep.gulik.controller;

import by.itstep.gulik.model.logic.ArrayExtremeValues;
import by.itstep.gulik.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input count of elements: ");
        int count = scanner.nextInt();

        double[] numbers = new double[count];

        System.out.print("Input array elements: ");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double max = ArrayExtremeValues.max(numbers);
        double min = ArrayExtremeValues.min(numbers);
        double avg = ArrayExtremeValues.avg(numbers);
        double permutation = ArrayExtremeValues.calcArrayOfOrderChanges(numbers);
        double sum = ArrayExtremeValues.sumOfTheSequence(numbers);
        double multi = ArrayExtremeValues.multiplicationOfTheSequence(numbers);

        String msg = String.format("Max value = %.2f.", max);
        String msg1 = String.format(" Min value = %.2f.", min);
        String msg2 = String.format(" Arithmetic mean of numbers = %.2f.", avg);
        String msg3 = String.format(" Max and min = %.2f.", permutation);
        String msg4 = String.format(" Sum = %.2f.", sum);
        String msg5 = String.format(" Multi = %.2f.", multi);

        Printer.print(msg + msg1 + msg2 + msg3 + msg4 + msg5);

    }
}
