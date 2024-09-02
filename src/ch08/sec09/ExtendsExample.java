package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl o = new InterfaceCImpl();
        o.methodA();
        o.methodB();
        o.methodC();

        System.out.println();
        InterfaceC c = o;
        c.methodA();
        c.methodB();
        c.methodC();

        System.out.println();
        InterfaceA a = o;
        a.methodA();

        System.out.println();
        InterfaceB b = o;
        b.methodB();


    }
}
