package ch17.sec09;

import java.util.Arrays;

public class MatchingExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        boolean b1 = Arrays.stream(arr)
                .allMatch(a -> a % 2 == 0);
        System.out.println("b1 = " + b1);

        boolean b2 = Arrays.stream(arr)
                .anyMatch(a -> a % 3 == 0);
        System.out.println("b2 = " + b2);

        boolean b3 = Arrays.stream(arr)
                .noneMatch(a -> a % 3 == 0);
        System.out.println("b3 = " + b3);
    }
}
