package ch09;

import java.util.Arrays;

public class ArraysTest {
    static void main(String[] args) {
        int[] arr = {3, 6, 7, 1, 4, 5, 3, 5, 24, 9, 5, 6};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, 3};
        int[] arr4 = {1, 2, 3};


        //1. arr의 모든요소를 출력하세요.
        for (int a : arr) {
            System.out.print(a);
            System.out.print(", ");
        }
        System.out.println("");
        //2. arr2dhk arr3, arr2와 arr4의 모든요소가 같은 값을 가지고 있는지 출력하세요.)순서와 값이 모두 일치

        boolean isEqual = true; //두 배열의 모든 요소가 같으면 트루 , 아니면 false

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != arr3[i]) {
                isEqual = false;
            }
        }
        System.out.println("arr2, arr3 = " + (isEqual ? "같음" : "다름"));

        isEqual = true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != arr4[i]) {
                isEqual = false;
            }
        }
        System.out.println("arr2, arr4 = " + (isEqual ? "같음" : "다름"));

        //3. arr요소의 최소값과 최대값을 구하시오
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);

        //4. arr요소를 오름차순으로 정렬하세요.
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int k = i; k < arr.length-1; k++){
                if(arr[i] > arr[k+1]){
                    temp = arr[i];
                    arr[i] = arr[k+1];
                    arr[k+1] = temp;
                    //arr[i] <-> arr[k]
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

    }
}