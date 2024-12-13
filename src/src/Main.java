package src;

import utility.PrinterHelper;
import BMI.BMICalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double height, weight;
        char option;

        do {

            PrinterHelper.showMainMenu();
            option = scanner.next().charAt(0);

            if (option != 'a' && option != 'b') {
                PrinterHelper.showInvalidEntry();
                continue;
            }

            if (option == 'b')
                break;

            PrinterHelper.showHeightMenu();
            height = scanner.nextDouble();

            PrinterHelper.showWeightMenu();
            weight = scanner.nextDouble();

            BMICalculator bmiCalculator = new BMICalculator(weight, height);
            bmiCalculator.calculateBMI();

            PrinterHelper.showBMIResult(bmiCalculator.showBMI());

        } while (option != 'b');

    }

}