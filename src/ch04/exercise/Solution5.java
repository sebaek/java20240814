package ch04.exercise;

public class Solution5 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int r = (4 * x) + (5 * y);
                if (r == 60) {
                    System.out.println(STR."(\{x}, \{y})");
                }
            }
        }
    }
}
