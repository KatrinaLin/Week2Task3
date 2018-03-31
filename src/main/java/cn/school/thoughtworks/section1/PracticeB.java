package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        if (collection1 == null || collection2 == null) {
            return null;
        }

        return collection1
                .stream()
                .filter(i -> (isContainElement(i, collection2)))
                .collect(Collectors.toList());

    }

    boolean isContainElement(String target, List<List<String>> collection2) {

        for (List<String> l : collection2) {
            if (l.contains(target)) {
                return true;
            }
        }

        return false;
    }
}
