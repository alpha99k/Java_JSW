public class ErrorTest {
    static void main(String[] args) {

        try{    //플랜 A
            int num = Integer.parseInt(args[0]);
            int result = 10 / 0;
            System.out.println("result : " + result);

        }catch (ArithmeticException e){     //플랜 B
            System.out.println(e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 종료");

        try {
            makeError();
        }catch (Throwable t){
            t.printStackTrace();
            System.out.println("에러 발생 : " + t.getClass().getSimpleName());;
        }

    }

    static void makeError(){
        makeError(); //재귀 호출
    }
}
