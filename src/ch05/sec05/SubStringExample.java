package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {

        String ssn = "880815-1234567";
        String first = ssn.substring(0, 6);
        String second = ssn.substring(7);

        System.out.println("first = " + first);
        System.out.println("second = " + second);
    }
}
