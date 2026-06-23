package ch02.list;

import java.util.*;

public class MapTest {

    void main(String[] args) {


//        Map<String, String> fruits = new HashMap();
//        Map<String, String> fruits = new TreeMap();
        Map<String, String> fruits = new LinkedHashMap();

        fruits.put("월","바나나");
        fruits.put("화","사과");
        fruits.put("수","오렌지");
        fruits.put("목","파인애플");
        fruits.put("수","수박");
        fruits.put("금","사과");

        String fridayFruits = fruits.get("금");
        System.out.println("월요일에 먹을 과일 : " + fridayFruits);

        printFruits(fruits); // 배열

    }
    // 전달받은 과일 목록을 출력한다.
    void printFruits(Map<String, String> fruits){
        System.out.println("월요일에 먹을 과일 : " + fruits.get("월"));
        System.out.println("수요일에 먹을 과일 : " + fruits.get("화"));
        System.out.println("화요일에 먹을 과일 : " + fruits.get("수"));

        System.out.println("                     요일별 모든 과일 출력 \n -----------------------------------------------------");
//        for(String key : fruits.keySet()){
//            System.out.println(key + "요일에 먹을 과일 : " + fruits.get(key));
//        }

        for(Map.Entry< String , String > entry : fruits.entrySet()){
            System.out.println(entry.getKey() + "요일에 먹을 과일 : " + entry.getValue());
        }

    }


}
