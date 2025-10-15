package calculator;

import java.util.List;

public class StringToNumberConverter {

    public List<Integer> convert(List<String> values) {
        return values.stream().map(Integer::parseInt).toList();
    }
}
