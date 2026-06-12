package ch10;

public class MethodProb {
    static int sum(int[] arr) {
        int sum = 0;
        for (int score : arr) {
            sum += score;
        }
        return sum;
    }
    static float avg(int[]arr){

        float avg = (float)sum(arr) / arr.length;
        return Math.round(avg * 10) / (float)10.0;
    }
    static void printScore(int[]arr){
        System.out.println("총점 : " + sum(arr)+ ", 평균 : " + avg(arr));
    }
    static void main(String[] args) {
        //haru는 국어 영어 수학 점수가 각각 80 70 56
        //namu는 국어 영어 수학 점수가 각각 90, 77, 80
        //brong는 ''              각각 100, 99, 88 이다.
        //셋의 총점 및 평균 출력
        int[] haru = { 80, 70, 56};
        int[] namu = { 90, 77, 80};
        int[] brong = { 100, 99, 88};

        printScore(haru);
        printScore(namu);
        printScore(brong);

    }
}
