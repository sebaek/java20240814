package ch12.sec06;

public class BoxingUnBoxingExample {

    public static void main(String[] args) {
        // Boxing
        Integer o = 100;
        System.out.println("o = " + o);

        // UnBoxing
        int v = o;
        System.out.println("v = " + v);

        // UnBoxing
        int a = o + 100;
        System.out.println("a = " + a);
    }
}
