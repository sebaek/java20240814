package ch04.lecture.p01if;

import java.util.Scanner;

public class C04Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이>");

        int age = scanner.nextInt();

        if (20 <= age) {
            System.out.println("성인입니다.");
        } else if (13 <= age) {
            System.out.println("청소년입니다.");
        } else if (6 <= age) {
            System.out.println("어린이입니다.");
        } else if (1 <= age) {
            System.out.println("유아입니다.");
        } else {
            System.out.println("나이를 잘못 입력");
        }
    }
}
