package ui;

import service.ColorService;

import java.io.IOException;

public class UI {

    private static final ColorService COLOR_SERVICE = new ColorService();

    public static void clearConsole() {
        try {
            windowsConsole();
        } catch (IOException | InterruptedException e) {
            linuxDistro();
        }
    }

    private static void windowsConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    private static void linuxDistro() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printBanner() {
        COLOR_SERVICE.blue(
                " ,-----.          ,--.                            ,--.                   \n" +
                        "'  .--./  ,--,--. |  | ,--.,--.  ,---.  ,--,--. ,-'  '-.  ,---.  ,--.--. \n" +
                        "|  |     ' ,-.  | |  | |  ||  | | .--' ' ,-.  | '-.  .-' | .-. | |  .--' \n" +
                        "'  '--'\\ \\ '-'  | |  | '  ''  ' \\ `--. \\ '-'  |   |  |   ' '-' ' |  |    \n" +
                        " `-----'  `--`--' `--'  `----'   `---'  `--`--'   `--'    `---'  `--'  " + "\n"
        );
    }


}
