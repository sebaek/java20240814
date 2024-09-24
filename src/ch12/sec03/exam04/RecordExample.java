package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {

        Member m = new Member("winter", "눈송이", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m);
//        System.out.println(m.toString());

        Member m2 = new Member("winter", "눈송이", 25);
        System.out.println(m.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m.equals(m2));
    }
}
