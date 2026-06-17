package ch11.capsule.ex02;

//  시험 결과를 관리하는 클래스
public class Score {

    private int kor;
    private int eng;
    private int math;


    //  수학점수를 반환한다. (Getter 메서드)
    public int getMath(){
        return this.math;
    }

    //  수학점수를 새로운값으로 교체한다. (Setter 메서드)
    public void setMath(int math){
        this.math = math;
    }


    public Score(int kor, int eng) {
        this.kor = kor;
        this.eng = eng;
    }

    Score(int kor, int eng, int math){
        if(kor > 100 || kor < 0){
            System.out.println("kor _ ERROR");
        }else{
            this.kor = kor;
        }
        if(eng > 100 || eng < 0){
            System.out.println("eng _ ERROR");
        }else{
            this.eng = eng;
        }
        if(math > 100 || math < 0){
            System.out.println("math _ ERROR");
        }else{
            this.math = math;
        }
    }



    // 총점을 계산해서 반환하는 메서드
    private int sum(){
        return kor+eng+math;
    }



    // 평균을 계산해서 반환하는 메서드(소수 셋째자리에서 반올림)
    double avg(){
        double avg = sum() / 3.0;
        return (Math.round(avg * 100) / 100.0);
    }

}
