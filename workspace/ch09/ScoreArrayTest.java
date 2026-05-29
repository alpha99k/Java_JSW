package ch09;
//        국어 영어 수학 점수를 이용하여 총점과 평균을 계산
public class ScoreArrayTest {
    static void main(String[] args) {
//        1.배열생성,선언,초기화 다 개별로 하기
//        int[] dayScore;  //1, 배열 선언
//        dayScore = new int[3]; // 배열 생성(개수 지정), 12byte의 메모리를 할당하고 그 주소를 반환
//        dayScore[0] = 100;     //  배열요소 초기화
//        dayScore[1] = 90;
//        dayScore[2] = 85;

//        int[] dayScore = new int[3]; // 2. 선언과 생성을 동시에
//        dayScore[0] = 100;     //  배열요소 초기화
//        dayScore[1] = 90;
//        dayScore[2] = 85;


//        3. 배열 선언 ,생성, 초기화를 동시에
        int[]dayScore = new int[]{100, 90, 85};
        System.out.println("국어 : " + dayScore[0]);
        System.out.println("영어 : " + dayScore[1]);
        System.out.println("수학 : " + dayScore[2]);


        int sum = dayScore[0] + dayScore[1] + dayScore[2];
        double avg = sum / 3.0;
          avg = Math.round(avg * 100) / 100.0;

        System.out.println( "총점 : " + sum);
        System.out.println( "평균 : " + avg);

    }
}
