package ch02;

import com.sun.source.tree.Tree;

import java.util.*;

public class ArrayListTest {

    void main(String[] args) {

//        String[] fruits = {"바나나","사과","오렌지","파인애플","수박"};
//        String[] fruits = new String[5];
//        fruits[0] = "바나나";
//        fruits[1] = "사과";
//        fruits[2] = "오렌지";
//        fruits[3] = "파인애플";
//        fruits[4] = "수박";


        // List
        // 1, 중복이 가능하다
        // 2, 순서 O

        // Set
        // 1, 데이터 중복 X
        // 2, 저장한 순서 X
//        ArrayList<String> fruits = new ArrayList();
//        LinkedList<String> fruits = new LinkedList();
//        Vector<String> fruits = new Vector<>();
//        HashSet<String> fruits = new HashSet<>();
//        TreeSet<String> fruits = new TreeSet<>();
        // TreeSet -> 정렬 O (ㄱ,ㄴ,ㄷ)
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        // LinkedHashSet -> 저장한 순서 O


        fruits.add("바나나");
        fruits.add("사과");
        fruits.add("오렌지");
        fruits.add("파인애플");
        fruits.add("수박");
        fruits.add("사과");

        printFruits(fruits); // 배열

    }
    // 전달받은 과일 목록을 출력한다.
    void printFruits(String[] fruits){
        for(int i = 0; i <= fruits.length-1; i++){
            System.out.println(fruits[i]);
        }
    }

    void printFruits(ArrayList<String> fruits){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    void printFruits(LinkedList<String> fruits){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    void printFruits(Vector<String> fruits){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    void printFruits(HashSet<String> fruits){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    void printFruits(TreeSet<String> fruits){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    void printFruits(LinkedHashSet<String> fruits){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }


}
