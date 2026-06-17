package ch13.family.ex02;

public class Test {
    static void main(String[] args) {
//        Parent p = new Parent("정승우");
//          Parent p = new Son("아들"); //업캐스팅 ( 자동 형변환, 자식 -> 부모)
        Parent p = new Daughter("딸");
        dailySchedule(p);
    }
    //  하루 일과
    //  Parent 타입의 매개변수 정의
    private static void dailySchedule(Parent p){
        p.eat();
        p.play();

        //p가 son인스턴스인지 여부를 체크
        if(p instanceof Son) {
            Son s = (Son) p; //다운 캐스팅(명시적 형변환) 부모 -> 자식
            s.study();
        }

        p.sleep();
    }
//    private static void dailySchedule(Son p){
//        p.eat();
//        p.play();
//        p.sleep();
//    }
//
//    private static void dailySchedule(Daughter p){
//        p.eat();
//        p.play();
//        p.sleep();
//    }
}
