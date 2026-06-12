package ch09;

public class EnhancedFor {
    static void main(String[] args) {
//        int[] score = {90, 80, 70};            //3과목
        int[] scores = {100, 80, 70, 88};       //4과목

        int sum = 0; //총잠
        float avg = 0; //평균

//        for (int i = 0; i < scores.length; i++){
//            sum += scores[i];
//        }

        for(int score : scores){                //향상된 포문
            sum += score;
        }

        avg = (float)sum / scores.length;


        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
