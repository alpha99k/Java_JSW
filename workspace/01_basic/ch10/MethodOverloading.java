package ch10;

public class MethodOverloading {

    void main() {
        int arr[] = {3,12,23,52,123,52,32};
        System.out.println(toString(arr));

        double score2[] = {132.2, 123.23,12.4};
        System.out.println(toString(score2));

        String name[] = {"jhon" , "smith", "kane"};
        System.out.println(toString(name));
        }


    //배열 내부에 모든 요소 값들을 문자열로 반환한다.
    //[ 0, 0, 0, 0, 0]
    String toString(int[] arr) {
        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i != arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
    String toString(double[] arr) {
        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i != arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
    String toString(String[] arr) {
        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i != arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}

