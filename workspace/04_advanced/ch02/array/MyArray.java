package ch02.array;


import ch02.list.MyList;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

/** java doc
 * 배열의 불편한점
 * 생성시 길이를 지정해야 함
 * 생성쇤 배열의 길이는 수정 못함
 * 요소 추가,삭제, 삽입이 어려움
 *
 * 이러한 불편한 점을 개선하여 쓰기 쉽게 만들기 위한 클래스
 */


public class MyArray implements MyList {

    /**
     * 내부적으로 요소를 저장하는 배열을 선언
     */
    private Object[] data;
    private int count;
    /**
     * 배열의 실제 담겨있는 요소의 개수
     */


    /**
     * 기본 생성자
     * 초기 배열의 크기를 10개로 지정한다.
     *
     */
    public MyArray() {
        this(10);
    }


    /**
     * 초기 배열의 크기를 지정한 size로 생성한다.
     * @param size 배열의 초기 크기
     */
    public MyArray(int size){
        this.data = new Object[size];
    }


    /**
     * 배열의 마지막 위치에 지정한 elem 를 추가한다.
     * @param elem 배열에 추가할 요소
     */
    public void add(Object elem){

        add(count, elem);
    }


    /**
     * 배열의 원하는 위치에 지정한 elem 를 추가한다.
     * @param index 삽입할 index(위치)
     * @param elem 삽입할 요소
     */
    public void add(int index, Object elem){

        //예외처리
        if(index < 0){
            throw new ArrayIndexOutOfBoundsException(index + " < " + 0);
        } else if(index > count){
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        }



        if(count >= data.length) {   //내부 배열의 공간이 다 찼을 경우 배열의 크기를 늘린다.(1.5배)
            Object[] temp = new Object[data.length + data.length / 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            System.out.println("ArrSize : " + data.length + " ----> ArrSize : " + temp.length);
            data = temp;
        }


        // 인덱스부터 끝까지 하나씩 뒤로 미는 작업
        System.arraycopy(data, index, data, index+1,count-index);
        data[index] = elem;
        count++;

    }


    /**
     * 지정한 index의 요소를 삭제한다.
     * @param index 삭제할 요소 인덱스
     */
    public void remove(int index){

        if(index >= count){
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        } else if(index < 0){
            throw new ArrayIndexOutOfBoundsException(index + " < " + 0);
        }

        System.arraycopy(data, index+1, data, index,count-index-1);
        count--;
        data[count] = null;
    }



    /**
     *  지정한 위치의 데이터를 반환한다.
     * @param index 반환할 데이터의 위치
     * @return 지정한 위치의 데이터
     */
    public Object get(int index){

        if(index >= count){
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        } else if(index < 0){
            throw new ArrayIndexOutOfBoundsException(index + " < " + 0);
        }

        return data[index];
    }

    /**
     * 배열에 실제적으로 들어있는 요소의 갯수 출력
     * @return 실질적으로 존재하는 요소의 갯수
     */
    public int size(){
        return this.count;
    }


    @Override
    public String toString(){
//        StringBuffer str = new StringBuffer("[ ");    //멀티스레드 환경에서 사용
        StringBuilder str = new StringBuilder("[ ");    //싱글스레드 환경에서 사용
        if(count > 0) {
            str.append(data[0]);
        }
        for(int i = 1; i < count; i++){
            str.append(", ").append(data[i]);
        }
        str.append(" ]");
        return str.toString();
    }

}
