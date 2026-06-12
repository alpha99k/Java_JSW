package ch11.capsule.ex02;

public class ScoreTest {
    static void main(String[] args) {
        Score haru = new Score(100,90,85);


//        int haruSum = haru.sum();
        double haruAvg = haru.avg();

//        System.out.println("하루의 총점 : " + haruSum);
        System.out.println("하루의 평균 : " + haruAvg);

        haru.setMath(haru.getMath() + 5);
        haruAvg = haru.avg();
        System.out.println("수정 : " + haruAvg);
    }
}
