package ch04.exercise;

public class Solution34 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i += 3) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }
}
