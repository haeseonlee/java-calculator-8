package calculator;

import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        CalculatorApp calculatorApp = new CalculatorApp(new InputView(),
                new OutputView(),
                new StringCalculatorService(new DelimiterParser(), new Calculator()));
        calculatorApp.start();
    }
}
