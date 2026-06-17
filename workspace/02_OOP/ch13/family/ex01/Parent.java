package ch13.family.ex01;

public abstract class Parent {

    //추상 클래스로 변경
    // 추상클래스는 직접 객체 생성이 불가.
    // 추상 메서드가 하나라도 있으면 반드시 추상 클래스로 선언

    //추상 클래스를 상속받는 자식 클래스는
    // 1. 추상 메서드를 모두 구현하거나
    // 2. 구현하지 못하는 추상메서드가 하나라도 남아있을 경우 자신도 추상 클래스가 되어야함

    String name;

    // 생성자 : 클래스 명과 동일한 이름, 리턴 타입은 없음
    public Parent(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println(name + " 음식을 맛있게 먹는다.");
    }
    void play(){
        System.out.println(name + " 등산한다.");
    }
    void sleep(){
        System.out.println(name + " 꿀짐을 잔다.");
    }
    abstract void study();
}
