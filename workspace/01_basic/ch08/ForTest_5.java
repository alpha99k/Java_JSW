package ch08;

public class ForTest_5 {
    static void main(String[] args) {
        star1();
        star2();
        star3();
        star4();
    }
//    *
//    **
//    ***
//    ****
//    *****
    static void star1() {
//        for (int i =0; i < 1; i++){
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i =0; i < 2; i++){
//            System.out.print("*");
//        }
//        System.out.println();
//
//        for (int i =0; i < 3; i++){
//            System.out.print("*");
//        }
//        System.out.println();
//
//        for (int i =0; i < 4; i++){
//            System.out.print("*");
//        }
//        System.out.println();
//
//        for (int i =0; i < 5; i++){
//            System.out.print("*");
//        }
//        System.out.println();
    }

    //    *
    //    **
    //    ***
    //    ****
    //    ***** x 50
    static void star2() {
//        for (int i = 0; i < 50; i++) {
//            for (int k = 0; k < i+1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }


    static void star3() {
//            for (int i = 0; i < 5; i++) {
//            for (int k = 0; k < (5-i); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }


    static void star4() {
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < (5-1-i); j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
