package Solves;

public class Q4 {
    static void main(String[] args) {
        int[] num = {1,2,3,2,1,3,6,8,7,9,7,9,7,1,1,1,0,0,0};
        int[] check = new int[10];
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < check.length; j++){
                if(num[i] == j) {
                    check[j] += 1;
                }
            }
        }
        for(int i = 0; i < check.length; i++){
            System.out.println(i + "의 개수 : " + check[i]);
        }
    }
}
