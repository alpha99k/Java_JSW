package ch05;

public class TypeCastingTest {
    static void main() {
        int a = 2100000000;
        double b = a;        //자동 형변환(a가 double로 형변환) 작은그릇 -> 큰그릇
        System.out.println(a);
        System.out.println(b);

        double pi =3.14;
        int p = (int)pi; //명시적 형변환 필요 (pi를 int로 변환) 큰그릇 -> 작은그릇
        System.out.println(pi);
        System.out.println(p);
    }
}
