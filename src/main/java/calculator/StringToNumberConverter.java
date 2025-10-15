package calculator;

import java.util.List;

public class StringToNumberConverter {

    public static List<Integer> convert(List<String> values) {
        return values.stream().map(Integer::parseInt).toList();
    }
}
