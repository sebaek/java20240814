package ch12.sec10;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class PatternExample {
    public static void main(String[] args) {
        String p1 = "(02|010)-\\d{3,4}-\\d{4}";
        System.out.println(matches(p1, "010-123-4567"));
        System.out.println(matches(p1, "02-123-4567"));
        System.out.println(matches(p1, "010-9123-4567"));
        System.out.println(matches(p1, "02-8123-4567"));

        String p2 = "\\w+@\\w+\\.\\w(\\.\\w)?";
        System.out.println(matches(p2, "angel@mycomcom"));

    }
}
