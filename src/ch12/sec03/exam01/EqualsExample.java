package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member o1 = new Member("blue");
        Member o2 = new Member("blue");
        Member o3 = new Member("red");

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o3));

        if (o1.equals(o2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        if (o1.equals(o3)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }
}
