package ch12.mycar;

public class BusTset {
    void main(){
        Bus mycar = new Bus("람보르기니","10-2","광역버스",
                1300,15, new String[]{"가", "나", "다"});

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        System.out.println(mycar.printBusInfo());
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        System.out.println(mycar.printBusInfo());
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        System.out.println(mycar.printBusInfo());
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        mycar.ride();
        System.out.println(mycar.printBusInfo());




    }
}
