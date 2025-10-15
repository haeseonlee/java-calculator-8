package calculator;

import java.util.Arrays;
import java.util.List;

public class DelimiterParser {

    public List<String> basicParser(String input) {
        return Arrays.stream(input.split("[,:]"))
                .toList();
    }

}
