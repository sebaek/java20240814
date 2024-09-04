package ch09.sec04.exam01;

public class A {
    public A() {
        class B {
        }
        B b = new B();
    }

    void method() {
        class B {
        }
        B b = new B();
    }
}
