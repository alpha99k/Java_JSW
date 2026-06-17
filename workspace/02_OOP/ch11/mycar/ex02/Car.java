package ch11.mycar.ex02;

public class Car {
    //  필드
    String model;
    int speed;  //필드를 초기화 하지 않으면 기본값으로 초기화 됨
    int gear;

    //  생성자 : 인스턴스를 생성될 때 자동으로 호출되는 메서드
    //  클래스 내부에 생성자를 하나도 만들지 않을 경우에 자바 컴파일러가 기본 생성자를 만들어준다.
    //  생성자를 하나라도 명시적으로 만들었을 경우에는 기본 생성자가 만들어 지지 않는다.
    //  기본 생성자 : 매개변수가 없는 생성자
    Car(){
        System.out.println("Car()생성자 호출");
    }

    //  생성자는 오버로딩이 가능
    Car(String model){
        System.out.println("Car(String)생성자 호출");
        this.model = model; //  this는 자기 자신의 인스턴스 참조 변수
    }


    //10km/h 가속
    void speedUp(){
        speed += 10;
        System.out.println("Speed UP ======> Now Speed =====>" + speed + "Km/h");
    }

    //10km/h 감속
    void speedDown(){
        speed -= 10;
        System.out.println("Speed Down ======> Now Speed =====>" + speed + "Km/h");
    }

    //기어를 1단 올린다.
    void gearUp(){
        gear++;
        System.out.println("Gear UP -------> " + gear + "stage");

    }


    //기어를 1단 내린다.
    void gearDown(){
        gear--;
        System.out.println("Gear DOWN -------> " + gear + "stage");

    }

    //출발
    void start(){
        System.out.println(model + "출발");
        System.out.println("START.");
        gearUp();
        speedUp();
    }

    //정지
    void stop(){
        System.out.println("Stop.");
        gear = 0;
        while(speed > 0) speedDown();
    }

}
