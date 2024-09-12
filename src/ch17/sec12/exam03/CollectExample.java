package ch17.sec12.exam03;

import ch17.sec12.exam01.Student;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 95),
                new Student("오해영", "여", 93)
        );

        Map<String, Double> map = list.stream()
                .collect(groupingBy(Student::getSex,
                        averagingDouble(Student::getScore)));
        System.out.println(map);
    }
}
