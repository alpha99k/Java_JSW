package ch02.array;

import java.util.ArrayList;

public class MyArrayTest {
    static void main(String[] args) {
        //    MyArray arr = new MyArray();
        MyArray arr = new MyArray(5);
        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.append(40);
        arr.append(50);
        arr.append(2, 25);
        arr.delete(10);

        System.out.println("2번 인덱스의 값 : " + arr.getElem(2));

        System.out.println("3번 인덱스의 값 : " + arr.getElem(3));

        System.out.println(arr);
    }

}
