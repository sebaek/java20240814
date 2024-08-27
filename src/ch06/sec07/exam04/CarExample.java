package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("자가용");
        Car c3 = new Car("자가용", "빨강");
        Car c4 = new Car("택시", "검정", 200);

        System.out.println("c1.company = " + c1.company);
        System.out.println();

        System.out.println("c2.company = " + c2.company);
        System.out.println("c2.model = " + c2.model);
        System.out.println();

        System.out.println("c3.company = " + c3.company);
        System.out.println("c3.model = " + c3.model);
        System.out.println("c3.color = " + c3.color);
        System.out.println();

        System.out.println("c4.company = " + c4.company);
        System.out.println("c4.model = " + c4.model);
        System.out.println("c4.color = " + c4.color);
        System.out.println("c4.maxSpeed = " + c4.maxSpeed);
    }
}
