package ch07;

public class SwitchTest {
    static void main(String[] args) {
        int month = 12;
        int sDay = 30, bDay = 31, specialCase = 28;
        String msg = "월의 마지막 날 : ";

        //switch문에서는 조건을 쓸 수 없다.
            switch (month) {
                case 1, 3, 5, 7, 9, 11:
                    System.out.println(month + msg + bDay);
                    break;
                case 2:
                    System.out.println(month + msg + specialCase);
                    break;
                case 4, 6, 8, 10, 12:
                    System.out.println(month + msg + sDay);
                    break;
                default:
                    System.out.println("Out of boundary!");
            }
        }
    }

