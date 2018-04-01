package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        List<String> list = object.get("value");

        // if the element in the list exists in the map, then reduce its value by 1
        list.stream().forEach(x -> collectionA.computeIfPresent(x, (k, v) -> v - 1));

        return collectionA;
    }
}
