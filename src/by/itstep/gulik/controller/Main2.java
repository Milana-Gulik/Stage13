package by.itstep.gulik.controller;

import by.itstep.gulik.model.logic.ArrayPalindrom2;
import by.itstep.gulik.view.Printer;

import java.util.Scanner;

public class Main2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input count of elements: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.print("Input your numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean isArraySimmetrical = ArrayPalindrom2.isArraySimmetrical(numbers);

        boolean result = isArraySimmetrical;

        String msg = result ? "Yes, number is palindrome"
                : "No, number isn't palindrome";

        Printer.print(msg);
    }
}