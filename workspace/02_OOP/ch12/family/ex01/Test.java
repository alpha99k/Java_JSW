package ch12.family.ex01;

public class Test {
    static void main(String[] args) {
//        Parent p = new Parent("정승우");
//        Son p = new Son("아들");
        Daughter p = new Daughter("딸");
        dailySchedule(p);
    }
    //  하루 일과
    //  Parent 타입의 매개변수 정의
    private static void dailySchedule(Parent p){
        p.eat();
        p.play();
        p.sleep();
    }

    private static void dailySchedule(Son p){
        p.eat();
        p.play();
        p.sleep();
    }

    private static void dailySchedule(Daughter p){
        p.eat();
        p.play();
        p.sleep();
    }
}
