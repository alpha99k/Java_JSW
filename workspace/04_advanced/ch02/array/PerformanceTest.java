package ch02.array;

public class PerformanceTest {
    void main(){
        int times = 100000;

        MyArray list = new MyArray();
        MyArray list2 = new MyArray();

        long start = System.currentTimeMillis();
        addFirst(list,times);
        System.out.println("저장된 개수 : " + list.size());
        long end = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        addLast(list2,times);
        System.out.println("저장된 개수 : " + list2.size());
        long end2 = System.currentTimeMillis();
        System.out.println("My arr addFrist 소요시간 : " + (end - start) + "ms");
        System.out.println("My arr addLast 소요시간 : " + (end2 - start2) + "ms");



    }

    //list를 이용해서 맨 앞에 times 만큼의 데이터를 추가한다.
    void addFirst(MyArray list, int times){
        for(int i = 0; i < times ; i++){
            list.append(0,"데이터 - " + i);
        }
    }

    void addLast(MyArray list, int times) {
        for (int i = 0; i < times; i++) {
            list.append("데이터 - " + i);
        }
    }
}
