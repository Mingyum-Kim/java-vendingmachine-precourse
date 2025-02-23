package vendingmachine.view.console;

public final class ConsoleWriter {
    public static void printlnMessage(String message) {
        System.out.println(message);
    }

    public static void printlnFormat(String message, Object... args) {
        printlnMessage(String.format(message, args));
    }
}
