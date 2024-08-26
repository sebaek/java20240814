package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String b = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] t = b.split(",");

        System.out.println("번호 = " + t[0]);
        System.out.println("제목 = " + t[1]);
        System.out.println("내용 = " + t[2]);
        System.out.println("성명 = " + t[3]);
        System.out.println();

        for (String u : t) {
            System.out.println(u);
        }
    }
}
