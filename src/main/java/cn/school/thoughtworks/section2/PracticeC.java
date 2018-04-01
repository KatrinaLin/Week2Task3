package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量
        //eg: "d-5" means five "d"
        Map<String, Integer> results = new HashMap<String, Integer>();

        collection1.stream()
                .forEach(x -> processString(results, x));
        return results;
    }

    private void processString(Map<String, Integer> results, String s) {

        OptionalInt separatorChar = s.chars().filter(c -> !Character.isLetterOrDigit(c)).findAny();

        if (separatorChar.isPresent()) {

            String separator = Character.toString ((char) separatorChar.getAsInt());
            int separatorIndex = s.indexOf(separator);

            // extract the element
            String str = s.substring(0, separatorIndex);

            // separatorIndex + 1 is the begin index of the number
            // get the end index of the number
            int i = separatorIndex + 1;
            while (i < s.length() && Character.isDigit(s.charAt(i))) i++;

            int count = Integer.parseInt(s.substring(separatorIndex + 1, i));

            results.compute(str, (k, v) -> (v == null ? count : v + count));

        } else {

            results.compute(s, (k, v) -> (v == null ? 1 : v + 1));

        }
    }
}

