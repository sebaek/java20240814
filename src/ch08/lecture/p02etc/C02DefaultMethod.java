package ch08.lecture.p02etc;

public class C02DefaultMethod {
}

interface MyInterface2 {
    void method1();

    // 코드블럭(메소드 몸통,body)이 있는
    // 인터페이스의 메소드
    default void method2() {
        System.out.println("MyInterface2.method2");
    }
}

class MyClass21 implements MyInterface2 {
    @Override
    public void method1() {
        System.out.println("MyClass21.method1");
    }

    // 필요하면 default 메소드도 재정의 가능
    @Override
    public void method2() {
        System.out.println("MyClass21.method2");
    }
}

class MyClass22 implements MyInterface2 {
    @Override
    public void method1() {
        System.out.println("MyClass22.method1");
    }
}
