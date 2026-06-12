package ch14;

import java.awt.*;

public class StringTest {
    static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == "Hello");
        System.out.println(s2 == "Hello");

        System.out.println(s1.equals(s2));

        s1 += " World";
        s2 += " Java";
        s1 += " Program";

        System.out.println(s1);
    }
}
