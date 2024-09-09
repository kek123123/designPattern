package main.ex.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client2 {
    public static void main(String[] args) {
        List<Test2> list = new ArrayList<>();
        list.add(new Test2("b", "b"));
        list.add(new Test2("b", "a"));
        list.add(new Test2("a", "e"));
        list.add(new Test2("a", "d"));
        list.add(new Test2("a", "a"));

        List<Test2> collect = list.stream().sorted(Comparator.comparing(Test2::getOne).reversed().thenComparing(Test2::getTwo)).collect(Collectors.toList());

        System.out.println("collect = " + collect);
    }
}

class Test2 {
    private String one;
    private String two;



    public Test2(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "one='" + one + '\'' +
                ", two='" + two + '\'' +
                '}';
    }
}
