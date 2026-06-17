package ch11.statictest;

public class MathUtilTest {
    static void main(String[] args) {
//        MathUtil m = new MathUtil();
//        m.PI = 3.14; // 상수이기 때문에 수정불가
        // 반지름 5인 원의 넓이는 xx입니다.
        double area = MathUtil.PI * 5 * 5;
        System.out.println("반지름 5 : " + area);

        MathUtil.area();
    }
}
