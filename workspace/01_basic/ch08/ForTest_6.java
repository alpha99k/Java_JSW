package ch08;

public class 구ForTest_6 {
    static void main(String[] args) {
        // 1~ 9단
        for(int i = 1; i < 10; i++){
            for (int k = 2; k < 10; k++){
                System.out.print(k + " * " + i + " = " + i*k + "\t" +"    |    ");
            }
            System.out.println("");
        }

    }

    static void StartScreen(){
        System.out.println("");
    }
}
