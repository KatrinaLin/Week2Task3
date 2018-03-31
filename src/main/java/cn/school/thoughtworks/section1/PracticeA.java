package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        if (collection1 == null || collection2 == null) {
            return null;
        }

        //选出1集合中与2集合中相同的元素
        return collection1
                .stream()
                .filter(i -> collection2.contains(i))
                .collect(Collectors.toList());
    }
}
