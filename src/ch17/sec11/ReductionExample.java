package ch17.sec11;

import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("감자바", 88)
        );

        Integer sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, Integer::sum);

        System.out.println("sum2 = " + sum2);


    }
}
