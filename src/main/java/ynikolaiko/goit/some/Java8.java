package ynikolaiko.goit.some;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by yaroslav on 17.06.16.
 */
public class Java8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ewrr");
        list.add("ewsdfsdfrr");
        list.add("gsdg");
        List<Integer> collect = list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        }).collect(toList());

        collect.forEach(i-> System.out.println(i.toString()));
    }
}
