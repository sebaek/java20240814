package ch04.lecture.p04for;

public class C05Gugudan {
    public static void main(String[] args) {
        // 9~2단 순으로 출력
        // 9 X 1 = 9
        // 9 X 2 = 18
        // 9 X 3 = 27
        // ..
        // 9 X 9 = 81
        // 8 X 1 = 8
        // ...
        // 2 X 9 = 18

        for (int i = 9; i >= 2; i--) {
            System.out.println(i + "단 #########");
            for (int j = 1; j <= 9; j++) {
                System.out.println(STR."\{i} X \{j} = \{i * j}");
            }
        }
    }
}
