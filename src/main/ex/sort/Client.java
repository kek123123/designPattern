package main.ex.sort;

import java.util.*;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        // int 배열 오름차순 정렬
        int[] intArr = {9, 3, 1, 5, 2};
        Arrays.sort(intArr);
        System.out.println("intArr = " + Arrays.toString(intArr));

        // int 배열 내림차순 정렬
        int[] reverserIntArr = Arrays.stream(intArr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println("reverserIntArr = " + Arrays.toString(reverserIntArr));


        // Integer 배열 오름차순 정렬
        Integer[] integerArr = {1, 5, 9, 2, 8, 7};
        Arrays.sort(integerArr);
        System.out.println("integerArr = " + Arrays.toString(integerArr));

        Arrays.sort(integerArr, Collections.reverseOrder());
        System.out.println("integerArr = " + Arrays.toString(integerArr));

        List<Test> list = new ArrayList<>();
        Test test = new Test(180, 70, "가");
        Test test2 = new Test(170, 85, "나");
        Test test3 = new Test(190, 80, "다");
        Test test4 = new Test(170, 82, "라");

        list.add(test);
        list.add(test2);
        list.add(test3);
        list.add(test4);

        // Test 객체 오름차순 정렬
        //list.sort(Collections.s);
        //list.forEach(System.out::println);


        Collections.sort(list);
        System.out.println("list = " + list);
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("list = " + list);

        Arrays.stream(intArr).boxed().collect(Collectors.toList());
        Arrays.stream(integerArr).collect(Collectors.toList());
    }
}


class Test implements Comparable<Test> {
    String str;
    int height;
    int weight;

    public Test(int height, int weight, String str) {
        this.height = height;
        this.weight = weight;
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "height : " + height + ", weight : " + weight + ", name : " + str;
    }

    @Override
    public int compareTo(Test o) {
        return this.height - o.height == 0 ? this.weight - o.weight : this.height - o.height;
    }
}