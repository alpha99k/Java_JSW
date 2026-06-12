package ch12.car;

public class BusTset {
    void main(){
        Bus mycar = new Bus("람보르기니","10-2","광역버스",
                1300,15, new String[]{"가", "나", "다"});
        mycar.start();
        mycar.speedUp(5);
        mycar.ride(5);
        mycar.stop();

        Bus mycar2 = new Bus("람보르기니","10-2","광역버스",
                1300,15, new String[]{"가", "나", "다"});

        mycar2.start();
        mycar2.speedUp(5);
        mycar2.ride(5);
        mycar2.stop();
        System.out.println(mycar);
        System.out.println(mycar2);

        System.out.println(mycar.equals(mycar2));
        System.out.println(hashCode());
        System.out.println(hashCode());




    }
}
