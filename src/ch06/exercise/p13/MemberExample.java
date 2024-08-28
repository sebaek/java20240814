package ch06.exercise.p13;

public class MemberExample {
    public static void main(String[] args) {
        Member m1 = new Member();
        Member m2 = new Member();
//        m1.name = "son";
        m1.setName("son");
//        m2.name = "lee";
        m2.setName("lee");
//        m1.age = 33;
        m1.setAge(33);
//        m2.age = 44;
        m2.setAge(44);

//        System.out.println(m1.name);
        System.out.println(m1.getName());
//        System.out.println(m2.name);
        System.out.println(m2.getName());

//        System.out.println(m1.age);
//        System.out.println(m2.age);
        System.out.println(m1.getAge());
        System.out.println(m2.getAge());

    }
}
