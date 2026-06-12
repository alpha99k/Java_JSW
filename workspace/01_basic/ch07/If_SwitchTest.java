package ch07;

//  나이에 따른 입장료 할인율 계산하는 프로그램을 작성하세요
//  7세 이하 : 영유야 할인 100%
//  8 - 13세 : 어린이 50% 할인
//  14 - 19세 : 청소년 30% 할인
//  65세 이상 : 70% 할인

public class If_SwitchTest {
    static void main(String[] args) {
        int price = 20000; //   정상가
        double discountRate;
        int lastPrice;
        int age = 1;
        String discountType;

        if(age <= 7){
            discountRate = 1;
            discountType = "영유아 할인 ";
        } else if (age <= 13) {
            discountRate = 0.5;
            discountType = "어린이 할인 ";
        } else if (age <= 19) {
            discountRate = 0.3;
            discountType = "청소년 할인 ";
        } else if (age >= 65){
            discountRate = 0.7;
            discountType = "경로 할인 ";
        } else {
            discountRate = 0;
            discountType = "None ";
        }

        lastPrice = (int)(price - (price * discountRate));

        System.out.println(discountType + (int)(discountRate*100) + "%가 적용되어 요금은 " + lastPrice + "원 입니다.");

    }
}
