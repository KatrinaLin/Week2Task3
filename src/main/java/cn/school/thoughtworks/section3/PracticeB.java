package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> list = object.get("value");

        // 选出collectionA中key跟collection2中value对应的list中的元素相同的元素,把他们的count满3减1
        list.stream().forEach(x -> collectionA.computeIfPresent(x, (k, v) -> v - v / 3));

        return collectionA;
    }
}
