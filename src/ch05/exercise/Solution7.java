package ch05.exercise;

public class Solution7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = 0;

        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("max = " + max);
    }
}
