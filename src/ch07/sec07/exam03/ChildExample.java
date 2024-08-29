package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent p = new Child();

        p.method1();
        p.method2();
        p.field1 = "data1";

//        p.method3();

        Child c = (Child) p;

        c.method3();
        c.field2 = "data2";
    }
}
