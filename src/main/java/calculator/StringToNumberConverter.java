package calculator;

import java.util.List;

public class StringToNumberConverter {

    public static List<Integer> convert(List<String> values) {
        try {
            return values.stream().map(Integer::parseInt).toList();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 잘못된 입력값입니다.");
        }
    }
}
