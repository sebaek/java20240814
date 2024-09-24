package ch06.exercise.p18;

public class Example {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        System.out.println(obj1 == obj2); // true
    }
}
