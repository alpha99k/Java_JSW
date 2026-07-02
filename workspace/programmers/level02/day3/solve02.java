package level02.day3;

import java.util.Arrays;

public class solve02 {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[arr.length/2];
        return answer;
    }
}
