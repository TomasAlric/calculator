package service;

import factory.CalculationFactory;
import rules.Calculable;

import java.util.Optional;
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
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextInt();
    }

    public double readNumberDouble(String message) {
        Scanner input = new Scanner(System.in);
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

    public int calculate(int number1, int number2, String operation) {
        Optional<Calculable> calculation = new CalculationFactory().create(operation);

        if (calculation.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            return calculation.get().calculate(number1, number2);
        }
    }
}
