package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {

        //把1集合中相同的元素统计出数量
        //eg: "d-5" means five "d"
        Map<String, Integer> results = new HashMap<String, Integer>();

        collection1.stream()
                .forEach(x -> processString(results, x));

        return results;
    }

    private void processString (Map<String, Integer> results, String s) {

        if (s.contains("-")) {

            String[] arr = s.split("-");
            String str = arr[0];
            int count = Integer.parseInt(arr[1]);

            results.compute(str, (k, v) -> (v == null ? count : v + count));

        } else {

            results.compute(s, (k, v) -> (v == null ? 1 : v + 1));

        }

    }

}
