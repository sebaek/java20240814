package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double v = calculator.areaCircle(10);
        System.out.println("v = " + v);

        Computer computer = new Computer();
        double w = computer.areaCircle(10);
        System.out.println("w = " + w);
    }
}
