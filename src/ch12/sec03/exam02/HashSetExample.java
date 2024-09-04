package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");
        Student s3 = new Student(2, "홍길동");

        set.add(s1);
        System.out.println(set.size()); // 1
        set.add(s2);
        System.out.println(set.size()); // 1
        set.add(s3);
        System.out.println(set.size()); // 2

    }
}
