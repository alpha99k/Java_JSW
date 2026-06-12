package ch12.car;


import java.util.Objects;

public class Bus extends Car{
    private int passengerCount; //  승객수
    private String no; //   버스 번호
    private String type; // 버스 종류
    private String[] stations; //   노선 정류장
    private int Location; // 버스 현재 위치
    private int fee; // 버스 요금
    private int passengerLimit; // 최대 승객수
    private int inCome; // 현재까지의 수익
    private int totalPassengers;
    private static int totalIncome;
    //인스턴스 레벨이 아니라 클래스레벨에서 관리하는 공용 변슈 선언 (static)

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
            inCome += fee;
            totalPassengers++;
            totalIncome += inCome;
            System.out.println("1명이 승차 하였습니다.");
        } else{
            System.out.println("정원 초과");
        }

    }

    void ride(int count){
        for(int i = 0; i < count; i ++){
            ride();
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
    void leave(int count){
        for(int i = 0; i < count; i ++){
            leave();
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

    public String toString(){
        return "버스 번호 : " + no
                +" | 현재 위치: " + stations[Location]
                + " | 남은 좌석 : " + (passengerLimit - passengerCount)
                + " | 요금 : " + fee
                + " | 수익 : " + inCome
                + " | 누적 승차 인원 : "  + totalPassengers
                + " | 모든 버스 수익 총합 : " + totalIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(no, bus.no);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(no);
    }
}
