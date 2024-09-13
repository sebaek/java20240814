package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo", null, "200"};

        for (int i = 0; i <= arr.length; i++) {
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("value = " + value);
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("데이터에 문제가 있음:" + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과함:" + e.getMessage());
            }
        }
    }
}
