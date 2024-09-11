package ch17.sec04;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class exam02StreamExample {
    public static void main(String[] args) {
        String[] arr1 = {"홍길동", "신용권", "김미나"};
        Stream<String> stream = Arrays.stream(arr1);
        stream.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(arr2);
        stream1.forEach(item -> System.out.print(item + ", "));
    }
}
