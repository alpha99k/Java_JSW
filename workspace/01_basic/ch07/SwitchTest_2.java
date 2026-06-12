package ch07;

//        A. 50퍼 할인
//        B. 30퍼 할인
//        C. 10퍼 할인
//        D. 0퍼 할인
public class SwitchTest_2 {
    static void main(String[] args) {
        int price = 10000;          //정상가
        int lastPrice;              //할인가격
        float discountRate;         //할인율
        char grade = 'A';           //회원등급

//        if (grade == 'A'){
//            discountRate = 50;
//        } else if (grade =='B') {
//            discountRate = 30;
//        } else if (grade =='C') {
//            discountRate = 10;
//        } else {
//            discountRate = 0;
//        }


        switch (grade){
            case 'A' :
                discountRate = 50;
                break;
            case 'B' :
                discountRate = 30;
                break;
            case 'C' :
                discountRate = 10;
                break;
            default:
                discountRate = 0;
        }

        lastPrice = (int)(price * (1 - discountRate / 100));

        System.out.println("회원님은 '" + grade + "' 등급이므로 정상가 " + price + "원에서 " +
                (int)discountRate + "% 할인된 가격 " + lastPrice + "원입니다.");

    }
}
