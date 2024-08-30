package ch07.exericse.p12;

public class Example {
    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }

    public static void action(A a) {
        a.method1();

        // 만약 C 객체라면
        // C의 method2() 를 호출
        if (a instanceof C c) {
            c.method2();
        }
    }
}
