package ch07.exericse.p04;

public class Solution {
}

class Parent {
    protected Object method(int a) {
        System.out.println("Parent.method");
        return null;
    }
}

class Child extends Parent {
    @Override
    protected String method(int a) {
        System.out.println("Child.method");
        return null;
    }
}
