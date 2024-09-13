package ch11.lecture.p03catch;

public class C01Catch {
    public static void main(String[] args) {
        try {
            // exception 발생 가능 코드
            int[] arr = {1, 10};
            int a = 3 / arr[0];
            int b = 5 / arr[1];
            int c = 7 / arr[2];

            System.out.println(a + ", " + b + ", " + c);
        } catch (ArithmeticException e) {
            // 특정 exception 에 관련된 코드
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            // 특정 exception 에 관련된 코드
            e.printStackTrace();
        }


    }
}
