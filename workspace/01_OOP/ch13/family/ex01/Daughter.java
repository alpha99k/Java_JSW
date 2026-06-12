package ch13.family.ex01;

//  Daughter 이 parent패 필드와 메서드를 상속받는다.
public class Daughter extends Parent{

    // 생성자 : 클래스 명과 동일한 이름, 리턴 타입은 없음
    public Daughter(String name) {
        super(name);
    }

    void play(){
        doFaceMask();
        System.out.println(name + " 카페를 간다.");
    }

    private void doFaceMask(){
        System.out.println(name + " 마스크팩을 한다.");
    }


    public void study(){
        System.out.println(name + " 과외를 받는다.");
    }




}
