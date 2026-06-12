package ch12.mycar;


public class Bus extends Car {
    private int passengerCount; //  승객수
    private String no; //   버스 번호
    private String type; // 버스 종류
    private String[] stations; //   노선 정류장
    private int Location; // 버스 현재 위치
    private int fee; // 버스 요금
    private int passengerLimit; // 최대 승객수
    private int inCome; // 현재까지의 수익

    // 컴파일러에 의해서 자동으로 생선되는 기본 생성자 모습
    //    Bus() { super(); }


    public Bus(String model, String no, String type, int fee, int passengerLimit, String[] stations) {
        super(model);
        this.no = no;
        this.type = type;
        this.fee = fee;
        this.passengerLimit = passengerLimit;
        this.stations = stations;
    }

    void ride(){
        if(passengerCount < passengerLimit) {
            passengerCount++;
            System.out.println("1명이 승차 하였습니다.");
        } else{
            System.out.println("정원 초과");
        }

    }

    void leave(){
        if(passengerCount > 0){
            passengerCount -- ;
            System.out.println("1명이 하차합니다.");
        } else {
            System.out.println("passengerCount Error");
        }

    }

    void stop(){
        super.stop();
        Location++;
        if(Location == stations.length){
            Location = 0;
        }
        System.out.println("어쩌구 저쩌구 : " + stations[Location]);
    }

    //기다리는 버스가 몇 정거장 전에 있는가.
    int getStationInfo(){
        int result = 0;
        return result;
    }

    String printBusInfo(){
        return "버스 번호 : " + no +" | 현재 위치: " + stations[Location] + " | 남은 좌석 : " + (passengerLimit - passengerCount) +" | 요금 : " + fee ;
    }


}
