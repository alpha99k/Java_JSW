package ch12.car;

public class Car {
    //  필드
    String model;
    int speed;  //필드를 초기화 하지 않으면 기본값으로 초기화 됨
    int gear;

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

    void speedUp(int speed){
        for(int i = 0; i < speed; i++){
            this.speed += 10;
        }
        System.out.println("Speed UP ======> Now Speed =====>" + this.speed + "Km/h");
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
