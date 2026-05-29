package Solves;

public class Q5 {
    static void main(String[] args) {
        int[][] numbers = {
                {12, 45, 8, 23},
                {34, 11, 56, 22},
                {9, 41, 17, 30}
        };
        int j=0;
        int max = 0;
        int[] loca = {0,0};
        for(int i = 0; i < numbers.length; i++){
            for( j = 0; j < numbers[i].length; j++){
                if(max < numbers[i][j]){
                    max = numbers[i][j];
                }
                if(max == numbers[i][j]){
                    loca[0] = j;
                }
                if(max == numbers[i][j]){
                    loca[1] = i;
                }
            }
        }
        System.out.println(max);
        System.out.println(loca[1] + "   " + loca[0]);
    }
}
