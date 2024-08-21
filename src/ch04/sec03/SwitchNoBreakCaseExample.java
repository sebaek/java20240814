package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        // 8, 9, 10, 11
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("time = " + time);

        switch (time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            case 11:
                System.out.println("외근을 나갑니다.");
        }
    }
}
