package ch10;

// 이름과 나이를 명령행 매개변수로 전달 받아서 출력
//java ch.10 .ArgsTest haru 6 -> {"haru","6"}
//java ch.10 .ArgsTest namu 9 -> { ''       }
public class ArgsTset {
    static void main(String[] args) {
        if(args.length < 2){
            System.out.println("사용법 java ch10.ArgsTest [이름] [나이]");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "살, 내년에는 " + (age +1 ) + "살이 됩니다.");

    }
}
