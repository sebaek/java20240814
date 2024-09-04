package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("삼성", "안드로이드");

        String s = smartPhone.toString();
        System.out.println("s = " + s);

        System.out.println(smartPhone);
    }
}
