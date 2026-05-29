package Solves;

public class Q3 {
    static void main(String[] args) {
        int[] arr = {8, 3, 15, 2, 9};
        int tempA = 0;
        int i = 0;
        if(arr[i] > arr[i+1]){
            tempA = arr[i];
        } else {
            tempA = arr[i+1];
        }
        for (i = 0; i < arr.length; i++){
            if(tempA < arr[i]){
                tempA = arr[i];
            }
        }
        System.out.println(tempA);
    }
}

