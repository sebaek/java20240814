package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        System.out.println("scores.length = " + scores.length); //2
        System.out.println("scores[0].length = " + scores[0].length);//3
        System.out.println("scores[1].length = " + scores[1].length);//2

        //첫번째반 평균
        double sum1 = 0;
        for (int i = 0; i < scores[0].length; i++) {
            sum1 += scores[0][i];
        }
        double avg1 = sum1 / scores[0].length;
        System.out.println("첫번째반 평균 = " + avg1);

        //두번째반 평균
        double sum2 = 0;
        for (int i = 0; i < scores[1].length; i++) {
            sum2 += scores[1][i];
        }
        double avg2 = sum2 / scores[1].length;
        System.out.println("두번째반 평균 = " + avg2);

        // 전체학생 평균
        int numOfStudents = 0;
        double sum3 = 0;

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                numOfStudents++;
                sum3 += scores[i][j];
            }
        }

        double avg3 = sum3 / numOfStudents;
        System.out.println("전체평균 = " + avg3);
    }
}
