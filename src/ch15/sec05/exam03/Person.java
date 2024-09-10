package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return o.name.compareTo(this.name);
//        return this.name.compareTo(o.name);
//        return o.age - this.age;
    }
}
