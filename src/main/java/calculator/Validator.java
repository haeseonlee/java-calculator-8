package calculator;

import java.util.List;

public class Validator {

    public static void validateNumericInput(List<String> numbers) {
        for (String number : numbers) {
            if (!number.matches("\\d+")) {
                throw new IllegalArgumentException("[ERROR] 숫자 이외의 값은 입력할 수 없습니다.");
            }
        }
    }

}
