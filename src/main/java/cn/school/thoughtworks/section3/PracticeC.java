package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        //统计出collection1中相同的元素的个数，形成collection3
        Map<String, Integer> collection3 = collectionA
                .stream()
                .collect(Collectors.groupingBy(x -> x, summingInt(x -> 1)));

        List<String> list = object.get("value");

        // 选出collection3中key跟collection2中value对应的list中的元素相同的元素,把他们的count满3减1
        list.stream().forEach(x -> collection3.computeIfPresent(x, (k, v) -> v - v / 3));

        return collection3;
    }
}
