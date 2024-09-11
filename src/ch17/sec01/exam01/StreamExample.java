package ch17.sec01.exam01;

import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = Set.of("홍길동", "신용권", "감자바");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
