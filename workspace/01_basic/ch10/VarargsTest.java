package ch10;

public class VarargsTest {

    // int 2개의 합계를 출력하는 메서드
    void sum(int n1, int n2){
        System.out.println("sum 1 메소드 시작");
        int result = n1 + n2;
        System.out.println("2개 " + result);
        System.out.println("sum 1 메소드 종료");
    }
    //     3개
    void sum(int n1, int n2,int n3){
        System.out.println("sum 2 메소드 시작");
        int result = n1 + n2 + n3;
        System.out.println("3개 " + result);
        System.out.println("sum 2 메소드 종료");
    }

    //     4개
    void sum(int n1, int n2, int n3, int n4){
        System.out.println("sum 3 메소드 시작");
        int result = n1 + n2 + n3 + n4;
        System.out.println("4개 " + result);
        System.out.println("sum 3 메소드 종료");
    }
    // int n개의 합계를 출력하는 메서드
    void sum(int...nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        System.out.println( sum );
    }

        void main() {
        System.out.println("메인메소드 시작 ");
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
        sum(1231,241241,4123232,3143,412321,43242);
        System.out.println("메인메소드 종료");
    }

}
