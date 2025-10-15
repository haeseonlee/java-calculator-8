package calculator;

import java.util.Arrays;
import java.util.List;

public class DelimiterParser {

    public List<String> basicParser(String input) {
        return Arrays.stream(input.split("[,:]"))
                .toList();
    }

    public List<String> customParser(String input) {
        String replacedStr = input.replaceAll("//", "").replace("\\n", "");
        String delimiter = replacedStr.substring(0, 1);
        return Arrays.stream(replacedStr.substring(1).split(delimiter))
                .toList();
    }

}
