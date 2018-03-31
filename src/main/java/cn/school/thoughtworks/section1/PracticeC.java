package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        if (collection1 == null || collection2 == null) {
            return null;
        }

        //选出1集合中跟2对象中value属性中的元素相同的元素
        return collection1
                .stream()
                .filter(i -> collection2.get("value").contains(i))
                .collect(Collectors.toList());
    }
}
