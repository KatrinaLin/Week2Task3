package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //把1集合中相同的元素统计出数量

        Map<String, Integer> results = collection1
                                            .stream()
                                            .collect(Collectors.groupingBy(x -> x, summingInt(x -> 1)));
        return results;
    }
}
