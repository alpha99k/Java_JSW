package Solves;

import java.util.Arrays;

public class Q6 {
    static void main(String[] args) {
        int[][] studentScores = {
                {90, 85, 95}, // 0번 학생 (평균 90) -> 합격
                {50, 60, 55}, // 1번 학생 (평균 55)
                {80, 80, 80}, // 2번 학생 (평균 80) -> 합격
                {70, 65, 75}  // 3번 학생 (평균 70)
        };
        int[][] success = studentScores.clone();
        int sum = 0;
        float avg = 0;
        for(int i = 0; i < studentScores.length; i ++){

            for(int j = 0; j < studentScores[i].length; j++){
                sum += studentScores[i][j];
                avg = (float)sum / studentScores[i].length;
                if(avg > 80){
                    System.arraycopy(studentScores, i, success, i , studentScores.length);
                }
            }
        }
        System.out.println(Arrays.toString(success));
    }
}
