package ch09;
//        국어 영어 수학 점수를 이용하여 총점과 평균을 계산
public class ScoreTest {
    static void main(String[] args) {
        int kor = 100;
        int eng = 90;
        int math = 85;

        int sum = kor + eng + math;
        double avg = sum / 3.0;
//        avg = Math.round(avg); //소수 첫째자리 반올림 , 92
//        avg = Math.round(avg * 10) / 10.0; //소수 둘째자리 반올림 , 91.7
          avg = Math.round(avg * 100) / 100.0; // 셋째

        System.out.println( "총점 : " + sum);
        System.out.println( "평균 : " + avg);

    }
}
