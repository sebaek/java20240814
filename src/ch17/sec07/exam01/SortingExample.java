package ch17.sec07.exam01;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", 30),
                new Student("신용권", 10),
                new Student("유미선", 20)
        );

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-reverseOrder-");
        list.stream()
                .sorted(reverseOrder())
                .forEach(System.out::println);
    }
}
