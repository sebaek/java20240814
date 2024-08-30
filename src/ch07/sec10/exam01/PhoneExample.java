package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("홍길동");

        phone.turnOn();
        phone.internetSearch();
        phone.turnOff();

//        Phone phone1 = new Phone("길동"); // x
    }
}
