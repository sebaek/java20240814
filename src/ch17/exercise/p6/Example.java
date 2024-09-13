package ch17.exercise.p6;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );


        // 고전적 방법
        double avg1 = 0.0;
        for (Member member : list) {
            avg1 += member.getAge();
        }
        avg1 /= list.size();
        System.out.println("avg1 = " + avg1);

        // stream
        double avg2 = list.stream()
                .map(Member::getAge)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("avg2 = " + avg2);


    }
}
