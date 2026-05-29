package ch05;

public class PrimitiveType {
    void main() {
//        int age;    // 변수선언
//        age = 28;   // 값 할당
//        age = 30;   // 값 재할당
//        System.out.println(age);
//
//        int score = 100;
//        System.out.println(score);

        byte b = 127;
        System.out.println(b);

        short s = 10000;
        System.out.println(s);

        int num = 1000000000;
        System.out.print("This is int ");
        System.out.println(num);

        long bigNum = 3000000000000000000L;
        System.out.print("This is long ");
        System.out.println(bigNum);

        double pi = 3.141592;
        System.out.print("This is double ");
        System.out.println(pi);

        float smallPi=3.14F;
        System.out.print("This is float ");
        System.out.println(smallPi);

        boolean isGood = true;
        System.out.print("This is boolean ");
        System.out.println(isGood);

        char charm = 128;
        System.out.print("This is char ");
        System.out.println(charm);

        System.out.println("---------String Type---------");
        String name1 = "정승우입니다.";
        String name2 = "      안녕하세요, ";
        System.out.print(name2);
        System.out.println(name1);
        System.out.println("-----------------------------\n\n");


        System.out.println("---------Constant Ex---------");
        final double PI2 = 3.1415926535; //final -> 상수선언, 변하지 않는 값 (변경X)
        System.out.println(PI2 * 5 * 5); //이름은 대문자

    }
}
