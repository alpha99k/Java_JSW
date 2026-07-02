import java.util.Arrays;

class Solution {
    void main(String[] args) {
        int[] arr = {1,11,3,4,1,2,3,1,233,3,2,2,3,3,3};
        System.out.println(solution(arr));
    }
    public int solution(int[] array) {
        int answer = 0;
        int count[] = new int[array.length];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (array[i] == array[j + i]) {
                    count[i]++;
                }
            }

        }
        Arrays.sort(count);
        System.out.println(Arrays.toString(count));
        answer = count.length != 1 ? (count[count.length - 2] == count[count.length - 1]) ? -1 : count[count.length-1] : 1 ;

        return answer;
    }
}