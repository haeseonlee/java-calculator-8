package calculator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static void validateNumericInput(List<String> numbers) {
        for (String number : numbers) {
            if (!number.matches("\\d+")) {
                throw new IllegalArgumentException("[ERROR] 숫자 이외의 값은 입력할 수 없습니다.");
            }
        }
    }

    public static void validateContainDelimiter(String input) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9가-힣ㄱ-ㅎㅏ-ㅣ]");
        Matcher matcher = pattern.matcher(input);

        if (!matcher.find() && !input.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 구분자를 입력해 주세요.");
        }
    }

    public static void validatePositiveNumber(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("[ERROR] 음수는 입력할 수 없습니다.");
            }
        }
    }
}
