import calculations.imc.Imc;
import calculations.scientific.Power;
import calculations.scientific.SquareRoot;
import calculations.shapes.Circle;
import calculations.shapes.Rectangle;
import calculations.shapes.Square;
import service.ColorService;
import service.ValidateService;
import ui.UI;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ColorService colorService = new ColorService();
        ValidateService validateService = new ValidateService();
        Scanner sc = new Scanner(System.in);

        boolean stop;


        do {

            try {

                UI.clearConsole();
                UI.printBanner();

                String type = validateService.toggle();

                if (type.equalsIgnoreCase("basic")) {

                    try {

                        String operation = validateService.readStringBasic();
                        double number1 = validateService.readNumberDouble("Enter the first number: ");
                        double number2 = validateService.readNumberDouble("Enter the second number: ");
                        Number result = validateService.calculate(number1, number2, operation);

                        System.out.println();
                        System.out.print(number1 + " ");
                        colorService.cyan(operation);
                        System.out.print(" " + number2 + " = " + result);
                    } catch (InputMismatchException e) {
                        throw new IllegalArgumentException();
                    }
                }

                if (type.equalsIgnoreCase("scientific")) {
                    try {
                        colorService.yellow("Choose between [POWER/SQUARE ROOT] ");
                        System.out.println();
                        String operation = validateService.readString();
                        if (operation.equalsIgnoreCase("power")) {
                            Power power = new Power();
                            int number1 = validateService.readNumber("Enter the number: ");
                            int number2 = validateService.readNumber("Enter the exponent: ");
                            System.out.println();
                            System.out.println("POWER = " + power.calculate(number1, number2));
                        } else {
                            SquareRoot squareRoot = new SquareRoot();
                            int number = validateService.readNumber("Enter the number: ");
                            DecimalFormat df = new DecimalFormat("#.00");
                            System.out.println();
                            System.out.println("SQUARE ROOT = " + df.format(squareRoot.calculate(number)));
                        }

                    } catch (InputMismatchException e) {
                        throw new IllegalArgumentException();
                    }
                }


                if (type.equalsIgnoreCase("areas")) {
                    colorService.yellow("Choose between CIRCLE/RECTANGLE/SQUARE");
                    System.out.println();
                    String operation = validateService.readString();

                    if (operation.equalsIgnoreCase("circle")) {
                        Circle circle = new Circle();
                        BigDecimal radius = validateService.readNumberBigDecimal("Enter the radius: ");
                        System.out.println();
                        System.out.println("CIRCLE AREA = " + (circle.circleArea(radius)));
                    }

                    if (operation.equalsIgnoreCase("rectangle")) {
                        Rectangle rectangle = new Rectangle();
                        int base = validateService.readNumber("Enter the base: ");
                        int height = validateService.readNumber("Enter the weight: ");
                        System.out.println();
                        System.out.println("RECTANGLE AREA = " + rectangle.calculate(base, height));

                    }

                    if (operation.equalsIgnoreCase("square")) {
                        double side = validateService.readNumber("Enter the side: ");
                        Square square = new Square();
                        System.out.println();
                        System.out.println("SQUARE AREA = " + square.squareArea(side));
                    }
                }

                if (type.equalsIgnoreCase("imc")) {
                    try {

                        Imc imc = new Imc();
                        BigDecimal number1 = validateService.readNumberBigDecimal("Enter your weight: ");
                        BigDecimal number2 = validateService.readNumberBigDecimal("Enter your height: ");
                        DecimalFormat df = new DecimalFormat("#.00");
                        System.out.println("IMC = " + df.format(imc.calculate(number1, number2)));
                    } catch (InputMismatchException e) {
                        throw new IllegalArgumentException();
                    }
                }

            } catch (IllegalArgumentException e) {
                colorService.yellow("\n" + "Type a valid operation");

                colorService.red("\nPress ENTER to continue");
                sc.nextLine();
            }
            stop = validateService.checkUserAnswer(sc, "\nDo you want to continue? [Y/N]\n");
        } while (stop);
    }
}