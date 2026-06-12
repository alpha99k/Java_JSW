package ch10;

import java.util.Arrays;

public class ArrayCopyMethod {
//    전달받은 배열의 모든요소를 출력
    static void printArr(int[] arr, String name){
        System.out.print(name + " : ");
          for(int elem : arr){
              System.out.print( elem + " ");
          }
            System.out.println("");

    }
//    원본 배열과 복사 배열을 출력한 후 값을 수정하고 다시 출력한다.
    static void testArr(int[] origin,int[] shallow){
        printArr(origin , "원본 배열");
        printArr(shallow , "복사 배열");

        origin[0] = 88;
        shallow[0] = 99;

        printArr(origin , "원본 배열");
        printArr(shallow , "복사 배열");
    }



    static void main(String[] args) {

        //1. 얕은복사 (shallow copy)
        int[] origin = {10, 20, 30, 40, 50};
        System.out.println("--------------1. 얕은복사 --------------------");
        int[] shallow = origin;
        testArr(origin, shallow);

        System.out.println("--------------2. 깊은 복사 - 수동 복사 (for문 사용)--------------------");
        origin = new int[]{10, 20, 30, 40, 50};
        shallow = new int[origin.length];
        for(int i = 0; i < origin.length; i++){
            shallow[i] = origin[i];
        }
        testArr(origin, shallow);

        System.out.println("-------------------3. 깊은 복사 (System.arraycopy())------------------");

        origin = new int[]{10, 20, 30, 40, 50};     //이미 선언된 변수에 새로운 배열을 할당하려면 new int[]{ ~ }형태로 작성해야함
        shallow = new int[origin.length];
        System.arraycopy(origin, 0,shallow, 0, origin.length);

        testArr(origin, shallow);

        System.out.println("-------------------4. 깊은 복사 (Arra.copyof())------------------");
        origin = new int[]{10, 20, 30, 40, 50};
        shallow = Arrays.copyOf(origin,origin.length);
        testArr(origin, shallow);







    }
}