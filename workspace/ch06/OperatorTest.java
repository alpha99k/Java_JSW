package ch06;

public class OperatorTest {
    static void main() {
        int num1 = 5;
        int num2 = 28;
        int num3, num5;

        num3 = num2 * num1;
        float num4 = (float)num2 / num1;
        num5 = num2 % num1;

        System.out.println(num1 + " * " + num2 + " = " + num3);
        System.out.println(num1 + " / " + num2 + " = " + num4);
        System.out.println(num1 + " % " + num2 + " = " + num5);

        System.out.println("++" + num1 + " = " + ++num1); // 6 전위
        System.out.println(num1 + "++" + " = " + num1++); // 6 후위
        System.out.println("num1 = " + num1);             // 7

        int a = 3;
        boolean b = ((++a) + 10) >= 14 && (2 + (3 * (++a)) >= 10); //처음 a는 4, 나중 a는 5
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}
