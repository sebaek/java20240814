package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("홍길동", 45));
        set.add(new Person("감자바", 25));
        set.add(new Person("박지원", 31));

        set.forEach(e -> System.out.println(e.name + ":" + e.age));
    }

}
