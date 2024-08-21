package ch04.lecture.p02switch;

public class C04Switch {
    public static void main(String[] args) {
        // 1~6 정수
        int n = (int) (Math.random() * 6) + 1;

        System.out.println("n = " + n);
        // 고전적 switch
        switch (n) {
            case 1:
            case 3:
                System.out.println("홀수");
                break;
            case 2:
                System.out.println("짝수");
                break;

        }
    }
}
