package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
//        Box<String> box1 = new Box<>();
        var box1 = new Box<String>();
        box1.content = "안녕하세요";

        var box2 = new Box<Integer>();
        box2.content = 100; // auto boxing
        int v = box2.content; // unboxings

    }
}
