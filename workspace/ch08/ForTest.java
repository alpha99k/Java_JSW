package ch08;

public class ForTest {
    static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;


        for (int i = 1; i <= num; i++){
            sum += i;
            System.out.println(i + "    " + sum);
        }

        System.out.println("1부터" + num + "까지의 합계: " + sum);
    }
}
