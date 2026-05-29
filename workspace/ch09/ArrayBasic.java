package ch09;

public class ArrayBasic {
    static void main(String[] args) {
        //scores int 배열을 선언하고 생성하새요.
        int[] scores = {1, 2, 3};
        String[] names;
        names = new String[5];
        names[0] = "jhon";
        names[1] = "smith";
        names[2] = "karen";
        names[3] = "bob";
        names[4] = "patrik";

        System.out.println(scores[1]);
        System.out.println(names[0] + " " + names[1] + " " + names[2]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            System.out.println(names);
        }
    }
}
