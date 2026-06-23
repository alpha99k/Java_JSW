package ch02.list;

public class PerformaceTest {
    void main(){
        int times = 100000;

        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();

        long start = System.currentTimeMillis();
        addFirst(list,times);
        System.out.println("저장된 개수 : " + list.size());
        long end = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        addLast(list2,times);
        System.out.println("저장된 개수 : " + list2.size());
        long end2 = System.currentTimeMillis();
        System.out.println("addFrist 소요시간 : " + (end - start) + "ms");
        System.out.println("addLast  소요시간 : " + (end2 - start2) + "ms");
        }


        //list를 이용해서 맨 앞에 times 만큼의 데이터를 추가한다.
        void addFirst(MyList list, int times){
            for(int i = 0; i < times ; i++){
                list.add(0,"데이터 - " + i);
            }
        }

        void addLast(MyList list, int times) {
            for (int i = 0; i < times; i++) {
                list.add("데이터 - " + i);
            }
        }
}

