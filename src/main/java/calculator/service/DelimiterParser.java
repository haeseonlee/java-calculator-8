package calculator.service;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class DelimiterParser {

    public List<String> selectParser(String input) {
        if (input.startsWith("//")) {
            return customParser(input);
        }
        return basicParser(input);
    }

    private List<String> basicParser(String input) {
        return Arrays.stream(input.split("[,:]"))
                .toList();
    }

    private List<String> customParser(String input) {
        String replacedStr = input.replaceAll("//", "").replace("\\n", "");
        String delimiter = replacedStr.substring(0, 1);

        String safeDelimiter = Pattern.quote(delimiter);

        return Arrays.stream(replacedStr.substring(1).split(safeDelimiter))
                .toList();
    }

}
