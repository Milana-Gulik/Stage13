package by.itstep.gulik.controller;

import by.itstep.gulik.model.logic.ArrayElementSame3;
import by.itstep.gulik.view.Printer;

import java.util.Scanner;

public class Main3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input count of elements: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.print("Input your numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean areElementsEquals = ArrayElementSame3.areElementsEquals(numbers);

        boolean result = areElementsEquals;

        String msg = result ? "Yes, all values same"
                : "No, all values not same";

        Printer.print(msg);


    }
}
