package calculator.service;

import calculator.domain.Calculator;
import calculator.util.StringToNumberConverter;
import calculator.util.Validator;

import java.util.List;

public class StringCalculatorService {

    private final DelimiterParser delimiterParser;
    private final Calculator calculator;

    public StringCalculatorService(DelimiterParser delimiterParser, Calculator calculator) {
        this.delimiterParser = delimiterParser;
        this.calculator = calculator;
    }

    public int stringAddCalculate(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        Validator.validateContainDelimiter(input);

        List<String> values = delimiterParser.selectParser(input);

        List<Integer> numbers = StringToNumberConverter.convert(values);
        Validator.validatePositiveNumber(numbers);

        return calculator.calculate(numbers);
    }
}
