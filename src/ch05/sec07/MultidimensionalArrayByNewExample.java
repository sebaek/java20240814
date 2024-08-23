package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;

        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
//                System.out.println(STR."mathScore[\{i}][\{j}] = \{mathScores[i][j]}");
                totalMathSum += mathScores[i][j];
            }
        }

        double mathAvg = (double) totalMathSum / totalStudent;
        System.out.println("수학점수 합 = " + totalMathSum);
        System.out.println("수학점수평균 = " + mathAvg);

        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        englishScores[0][0] = 90;
        englishScores[0][1] = 91;

        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        int students = 0;
        int englishSum = 0;

        for (int[] english : englishScores) {
            students += english.length;
            for (int score : english) {
                englishSum += score;
            }
        }

        double englishAvg = (double) englishSum / students;
        System.out.println("영어합:" + englishSum);
        System.out.println("영어평균:" + englishAvg);


    }


}
