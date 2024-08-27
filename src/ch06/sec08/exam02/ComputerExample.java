package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer c = new Computer();
        int r1 = c.sum(1, 2, 3);
        System.out.println("r1 = " + r1);

        int r2 = c.sum(1, 2, 3, 4, 5);
        System.out.println("r2 = " + r2);

        int[] v = {1, 2, 3, 4, 5};
        int r3 = c.sum(v);
        System.out.println("r3 = " + r3);

        int r4 = c.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("r4 = " + r4);
    }
}
