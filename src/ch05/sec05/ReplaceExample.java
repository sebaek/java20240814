package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        String old = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String n = old.replace("자바", "java");

        System.out.println(old);
        System.out.println(n);

    }
}
