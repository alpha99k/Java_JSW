package ch07;

public class IfTest_2 {
    public static void main(String[] args) {
        int month = 1;
        int sDay = 30, bDay = 31, specialCase = 28;


//      System.exit(0); 프로그램 강제종료 현업에서는 거의 쓰지않는다.
        if(month > 12 || month < 1){
            System.out.println("Out of boundary!");
        } else{
            if (month % 2 == 1){
                System.out.println(month + "월의 마지막 : " + bDay);
            } else if(month == 2){
                System.out.println(month + "월의 마지막 : " + specialCase);
            } else{
                System.out.println(month + "월의 마지막 : " + sDay);
            }
        }
    }
}
