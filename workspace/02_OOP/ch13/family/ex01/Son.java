package ch13.family.ex01;

//  son이 parent의 필드와 메서드를 상속받는다.
public class Son extends Parent{

    // 생성자 : 클래스 명과 동일한 이름, 리턴 타입은 없음
    public Son(String name) {
        super(name);
    }

    //오버라이딩(오버로딩 아님)
    void play(){
        work();
        System.out.println(name + " 게임한다.");
    }

    private void work(){
        System.out.println(name + " 일을 한다.");
    }

    public void study(){
        System.out.println(name + " 도사관에서 공부한다.");
    }

}
