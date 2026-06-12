package ch13.family.ex02;

public class Parent {

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
}
