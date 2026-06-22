package ch02.array;


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


public class MyArray {

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

    public void append(Object elem){
        append(count, elem);
    }

    /**
     * 배열의 원하는 위치에 지정한 elem 를 추가한다.
     * @param index 삽입할 index(위치)
     * @param elem 삽입할 요소
     */
    public void append(int index, Object elem){
        // 인덱스부터 끝까지 하나씩 뒤로 미는 작업
        System.arraycopy(data, index, data, index+1,count-index);
        data[index] = elem;
        count++;

    }

    /**
     * 지정한 index의 요소를 삭제한다.
     * @param index 삭제할 요소 인덱스
     */
    public void delete(int index){
        System.arraycopy(data, index+1, data, index,count-index-1);
        count--;
        data[count] = null;
    }


    @Override
    public String toString(){
        String str = "[ ";

        if(count > 0) {
            str += data[0];
        }

        for(int i = 1; i < count; i++){
            str +=  ", " + data[i];


        }

        str += " ]";
        return str;
    }


}
