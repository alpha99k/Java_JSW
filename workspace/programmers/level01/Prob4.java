package level01;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        for(int i = 0; i < a.length(); i++){
            if(Character.isUpperCase(arr[i])){
                System.out.print(Character.toLowerCase(arr[i]));
            }else{
                System.out.print(Character.toUpperCase(arr[i]));
            }
        }
    }
}