package ch05.exercise;

public class Solution8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int elements = 0;
        double sum = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
                elements++;
            }
        }

        double avg = sum / elements;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
