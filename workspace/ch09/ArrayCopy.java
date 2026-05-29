package ch09;

import java.util.Arrays;

public class ArrayCopy {
    static void main(String[] args) {

        //1. 얕은복사 (shallow copy)
        int[] origin = {10, 20, 30, 40, 50};
        int[] shallow = origin;

        System.out.println("--------------1. 얕은복사 --------------------");
        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin : " + origin[i] + ", shallow : " + shallow[i]);
        }

        shallow[0] = 99;
        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin : " + origin[i] + ", shallow : " + shallow[i]);

        }

        System.out.println("--------------2. 깊은 복사 - 수동 복사 (for문 사용)--------------------");
        //2. 깊은 복사 - 수동 복사 (for문 사용)
        origin = new int[]{10, 20, 30, 40, 50};     //이미 선언된 변수에 새로운 배열을 할당하려면 new int[]{ ~ }형태로 작성해야함
        shallow = new int[origin.length];
        for(int i = 0; i < origin.length; i++){
            shallow[i] = origin[i];
        }
        shallow[0] = 99;
        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin : " + origin[i] + ", shallow : " + shallow[i]);
        }

        System.out.println("-------------------3. 깊은 복사 (System.arraycopy())------------------");

        origin = new int[]{10, 20, 30, 40, 50};     //이미 선언된 변수에 새로운 배열을 할당하려면 new int[]{ ~ }형태로 작성해야함
        shallow = new int[origin.length];
        System.arraycopy(origin, 0,shallow, 0, origin.length);

        shallow[0] = 99;
        origin[3] = 77;
        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin : " + origin[i] + ", shallow : " + shallow[i]);
        }

        System.out.println("-------------------4. 깊은 복사 (Arra.copyof())------------------");
        origin = new int[]{10, 20, 30, 40, 50};
        shallow = Arrays.copyOf(origin,origin.length);
        shallow[0] = 44;
        origin[3] = 444;
        for (int i = 0; i < origin.length; i++) {
            System.out.println("origin : " + origin[i] + ", shallow : " + shallow[i]);
        }







    }
}