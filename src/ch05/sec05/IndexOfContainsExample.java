package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String s = "자바 프로그래밍";

        int location = s.indexOf("프로그래밍");
        System.out.println(location);
        String substring = s.substring(location);
        System.out.println("substring = " + substring);

        int i = s.indexOf("자바");
        if (i != -1) {
            System.out.println("자바 책입니다.");
        } else {
            System.out.println("자바 책이 아닙니다.");
        }

        boolean r = s.contains("자바");

        if (r) {
            System.out.println("자바 책입니다.");
        } else {
            System.out.println("자바 책이 아닙니다.");
        }
    }
}
