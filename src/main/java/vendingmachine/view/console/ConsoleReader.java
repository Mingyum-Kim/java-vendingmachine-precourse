package vendingmachine.view.console;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.global.exception.CustomException;
import vendingmachine.global.exception.ErrorMessage;

public final class ConsoleReader {
    public static String enterMessage() {
        return Validator.validate(Console.readLine());
    }

    private static class Validator {
        public static String validate(String message) {
            validateBlankInput(message);
            return message;
        }

        private static void validateBlankInput(String message) {
            if (message.isBlank()) {
                throw CustomException.from(ErrorMessage.BLANK_INPUT_ERROR);
            }
        }
    }
}
