package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int code = no + name.hashCode();
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            if (this.no == target.no && this.name.equals(target.name)) {
                return true;
            }
        }
        return false;
    }
}
