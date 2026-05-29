package ch10;

public class MethodTest {
    void main(){
        add();
        add();
        add100(20);
        add100(30);
        printsum(10,13);
        printsum(1123,1243);
        int result = getsum(123,4213);
        System.out.println(result);
    }
    //10 과 100 의 합계를 출력하는 메서드
    void add(){
        int n1 =10;
        int n2 = 100;
        int sum = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + sum);
    }

    // 전달되는 인자와 100의 합계를 출력하는 메서드
    void add100(int n1){
        int sum = n1 + 100;
        System.out.println(sum);
    }

    //전달되는 인자 두개의 합계를 출력하는 매서드
    void printsum(int n1, int n2){
        int sum = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + sum);
    }

    //전달되는 인자 두개의 합계를 반환하는 메서드
    int getsum(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
}
