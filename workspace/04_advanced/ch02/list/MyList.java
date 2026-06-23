package ch02.list;

public interface MyList {
    /**
     * 지정한 데이터를 마지막 요소로 추가한다.
     * @param obj 추가할 데이터
     */
    void add(Object obj);

    /**
     * 지정한 데이터를 Index위치에 삽입한다.
     * @param index 삽입될 위치
     * @param obj 삽입할 데이터
     */

    void add(int index,Object obj);

    /**
     * 지정한 index의 데이터를 삭제한다.
     * @param index 삭제할 위치
     */
    void remove(int index);

    /**
     * 지정한 인덱스의 데이터를 조회
     * @param index 지정할 인덱스
     * @return 조회할 데이터
     */
    Object get(int index);

    /**
     * 데이터의 수를 반환
     * @return 데이터 수
     */
    int size();
}
