package ch02.list;

import ch02.array.MyArray;

public class MyLinkedListTest {
    void main(){

            // 5개의 요소를 담을 수 있는 MyArray 객체 생성
            MyLinkedList arr = new MyLinkedList();
            // MyArray에 "데이터-0"부터 "데이터-4"까지의 문자열을 담는다.
            for(int i = 0; i < 5; i++){
                arr.add("데이터 - " +i);
            }
            // MyArray에 담긴 모든 요소를 출력한다. [데이터 - 0,,,데이터 - 4]
            System.out.println(arr);
            //MY Array의 0번째 데이터 출력
            System.out.println(arr.get(0));

            //MY Array의 3번째 데이터 출력
            System.out.println(arr.get(3));

            //인덱스 2 삭제
            arr.remove(2);

            //My arrary 모든 요소 출력
            System.out.println(arr);

            arr.add(2, "데이터 - 5");

            System.out.println(arr);

            arr.add("데이터 - 6");

            System.out.println(arr);

            System.out.println("갯수: " + arr.size());

    }
}
