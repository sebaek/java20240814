package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트 tv");

        var product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("suv 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
