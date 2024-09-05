package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer a = 300;
        Integer b = 300;

        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true

        Integer c = 10;
        Integer d = 10;
        System.out.println(c == d); // true
        System.out.println(c.equals(d)); // true

    }
}
