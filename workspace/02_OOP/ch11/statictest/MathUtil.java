package ch11.statictest;

import java.util.Stack;

public class MathUtil {
    //PI 상수선언
    final static double PI = 3.141592;      //static 필드
    int r = 5;                              //인스턴스 필드

    static void area(){
//        System.out.println(PI * r * r);
    }

    int add(int n1, int n2){
        return n1 + n2;
    }

}
