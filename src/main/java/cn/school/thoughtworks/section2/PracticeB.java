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
        int count = 1;
        String str = s;

        if (s.contains("-")) {
            String[] arr = s.split("-");
            str = arr[0];
            count = Integer.parseInt(arr[1]);
        }

        if (results.get(s) == null) {
            results.put(str, count);
        } else {
            results.put(str, results.get(s) + count);
        }
    }

}
