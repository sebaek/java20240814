package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {

        int[] oldArr = {1, 2, 3};
        int[] newArr = new int[5];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
