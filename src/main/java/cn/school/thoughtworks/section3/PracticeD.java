package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<String, Integer>();

        collectionA.stream()
                .forEach(x -> processString(collection3, x));

        List<String> list = object.get("value");

        // 选出collection3中key跟collection2中value对应的list中的元素相同的元素,把他们的count满3减1
        list.stream().forEach(x -> collection3.computeIfPresent(x, (k, v) -> v - v / 3));

        return collection3;
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
