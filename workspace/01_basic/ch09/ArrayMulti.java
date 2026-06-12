package ch09;

public class ArrayMulti {
    static void main(String[] args) {
        // 1. 다차원 배열(2행 3열)
        int[][] matrix = new int[2][3];
        matrix[0][1] = 10;
        matrix[1][2] = 20;

        // 2. 다차원 배열 생성 ( 초기화와 동시에 )
        int[][] matrix2 ={
                {10,20,30},
                {40,50,60},
                {70,80,90},
                {20}
        };

        // 3. 배열 모든 요소 출력

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++){
                System.out.println(matrix2[i][j]);
            }
        }

    }
}
