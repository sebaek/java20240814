package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");
        System.out.println("s1 객체가 생성됐습니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 Student 객체를 참조합니다");
        System.out.println("s2 객체가 만들어졌다.");
    }
}
