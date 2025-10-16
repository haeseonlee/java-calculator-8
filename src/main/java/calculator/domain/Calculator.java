package calculator.domain;

import java.util.List;

public class Calculator {

    public int calculate(List<Integer> numbers) {
        return numbers.stream().mapToInt(n -> n).sum();
    }
}
