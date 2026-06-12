package ch13.family.ex01;

public class Test {
    //상속, 다형성 , instanceof 예제사용


    static void main(String[] args) {
//        Parent p = new Parent("정승우");
//        Parent p = new Son("아들"); //업캐스팅 ( 자동 형변환, 자식 -> 부모)
        Parent p = new Daughter("딸");
        dailySchedule(p);
    }
    //  하루 일과
    //  Parent 타입의 매개변수 정의
    private static void dailySchedule(Parent p){
        p.eat();
        p.play();
        p.study();
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
