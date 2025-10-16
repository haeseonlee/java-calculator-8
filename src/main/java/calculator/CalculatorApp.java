package calculator;

import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorApp {

    private final InputView inputView;
    private final OutputView outputView;
    private final StringCalculatorService service;

    public CalculatorApp(InputView inputView, OutputView outputView, StringCalculatorService service) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.service = service;
    }

    public void start() {
        String input = inputView.readString();
        int result = service.StringAddCalculate(input);
        outputView.printResult(result);
    }
}
