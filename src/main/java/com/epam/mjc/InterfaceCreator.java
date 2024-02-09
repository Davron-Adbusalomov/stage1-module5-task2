package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> list1 = new ArrayList<>();
            for (Integer num:list) {
                list1.add(num/divider);
            }
            return list1;
        };
    }
}
