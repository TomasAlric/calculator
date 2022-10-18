package service;

import factory.CalculationFactory;

import java.util.Locale;
import java.util.Scanner;

public class ValidateService {

    public boolean checkUserAnswer(Scanner sc, String txt) {
        return this.validateUserAnswer(sc, txt);
    }

    private boolean validateUserAnswer(Scanner sc, String txt) {
        String answer;
        do {
            new ColorService().purple(txt);
            answer = sc.nextLine().toUpperCase().strip();
        } while (!answer.startsWith("Y") && !answer.startsWith("N"));

        return answer.startsWith("Y");
    }

    public int readNumber(String message) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(message);
        return input.nextInt();
    }

    public double readNumberDouble(String message) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(message);
        return input.nextDouble();
    }

    public String readStringBasic() {
        Scanner inbound = new Scanner(System.in);
        ColorService colorService = new ColorService();
        System.out.print("Enter the desired operation: ");
        System.out.print("[");
        colorService.purple(" + ");
        System.out.print(" | ");
        colorService.purple(" - ");
        System.out.print(" | ");
        colorService.purple(" * ");
        System.out.print(" | ");
        colorService.purple(" / ");
        System.out.print("]");


        System.out.println();
        return inbound.nextLine();
    }

    public String toggle() {
        Scanner type = new Scanner(System.in);
        ColorService colorService = new ColorService();
        System.out.print("Choose calculation type: ");
        colorService.yellow("[BASIC/SCIENTIFIC/AREAS/IMC]");
        System.out.println();
        return type.nextLine();
    }

    public double readRadius() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        return input.nextDouble();
    }

    public String readString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired operation: ");
        System.out.println();
        return input.nextLine();
    }

    public Number calculate(double number1, double number2, String operation) {
        return new CalculationFactory().create(operation).calculate(number1, number2);
    }
}
