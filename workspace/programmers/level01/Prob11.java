package level01;

import java.util.Arrays;

public class Prob11 {
    void main(String[] args) {
        System.out.println(solution("aaaa","bbbb"));
    }
    public String solution(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char[] arr3 = new char[arr1.length+arr2.length];

        for(int i = 0, j = 0; j < arr1.length; i+=2, j++){
            arr3[i] = arr1[j];
        }
        for(int i = 1, j =0; j < arr2.length; i+=2 , j++){
            arr3[i] = arr2[j];
        }
        String answer = Arrays.toString(arr3);
        answer = answer.replace("," , "");
        answer = answer.replace("[" , "");
        answer = answer.replace("]" , "");
        return answer.replace(" ", "");
    }
}
