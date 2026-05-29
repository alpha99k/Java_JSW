package Solves;

import java.util.Scanner;

public class Q7 {
    static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 7};
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 0;

        for(i = 0; i < arr.length; i++){
            if(a == arr[i]){
                System.out.println("찾았습니다.");
                break;
            } else if(i == arr.length-1){
                System.out.println("없습니다.");
            }
        }
    }
}
