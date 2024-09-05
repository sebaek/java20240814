package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C06Exercise {
    public static void main(String[] args) {
        // 사용자 입력을 받아서
        // 전화번호 패턴과 같은 지 확인
        // 010-9999-1111
        // 02-2345-6789
        // 031-789-7890

        Scanner scanner = new Scanner(System.in);
        String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
        while (true) {
            System.out.print("전화번호>");
            String input = scanner.nextLine();
            if (Pattern.matches(pattern, input)) {
                System.out.println("유효한 전화번호 👌");
            } else {
                System.out.println("유효하지 않습니다 ❌");
            }
        }
    }
}
