package Solves;

public class Q9 {
    static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,4,5};
        int temp = arr.length;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]) {
                temp -= 1;
            }
        }
        System.out.println(temp);
        System.out.println(arr.length);
    }
}
