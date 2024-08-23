package ch05.lecture.p02reference;

import java.util.Arrays;

public class C04Matrix {
    public static void main(String[] args) {
        // 행의 수만 결정
        int[][] m = new int[3][];
        System.out.println("m.length = " + m.length);
        System.out.println("m[0] = " + m[0]);
        System.out.println("m[0] = " + m[1]);
        System.out.println("m[0] = " + m[2]);
        System.out.println(Arrays.toString(m));

        m[0] = new int[3];
        m[1] = new int[]{11, 22, 33};
        m[2] = new int[]{99, 88};

        // 11, 33, 88
        System.out.println(m[1][0]); //11
        System.out.println(m[1][2]); //33
        System.out.println(m[2][1]); //88

    }
}
