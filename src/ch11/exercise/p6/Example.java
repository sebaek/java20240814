package ch11.exercise.p6;

public class Example {
    public static void main(String[] args) {
        String[] arr = {"10", "2a"};
        int value = 0;

        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과");
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 안됨");
            } finally {
                System.out.println(value);
            }
        }
    }
}
