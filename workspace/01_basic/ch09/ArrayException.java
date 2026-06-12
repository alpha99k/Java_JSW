package ch09;

public class ArrayException {
    static void main(String[] args) {
        // 1. NullPointerException
        String[] strArr = {"kane","paul","jane"};

        System.out.println(strArr[0]);

        int[] ageArr = null;

        if(ageArr != null){
            System.out.println(ageArr[0]);
        }


        // 2. ArrayIndexOutofBoundsException
        if (strArr.length > 3){
            System.out.println(strArr[3]);
        }


        System.out.println("main 실행완료.");





    }
}
