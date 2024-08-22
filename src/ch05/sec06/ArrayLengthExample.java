package ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {84, 90, 96};
        int sum = 0;

        // enhanced for로 바꿔보기
//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
        for (int score : scores) {
            sum += score;
        }
        System.out.println("총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균 = " + avg);

    }
}
