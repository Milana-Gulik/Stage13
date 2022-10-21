package by.itstep.gulik.controller;

import by.itstep.gulik.model.logic.ArrayEvenNumber4;
import by.itstep.gulik.view.Printer;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input count of elements: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.print("Input your numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int areEvenNumbers = ArrayEvenNumber4.areEvenOrOddNumbers(numbers);
        String msg = String.format("Quantity of even numbers = %d", areEvenNumbers);
        String msg1 = String.format("\nQuantity of odd numbers = %d",
                count - ArrayEvenNumber4.areEvenOrOddNumbers(numbers));
        Printer.print(msg + msg1);
    }
}


