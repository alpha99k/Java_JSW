package level01;

import java.util.Arrays;

public class Prob10 {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] arr = my_string.toCharArray();
        char[] reArr = overwrite_string.toCharArray();
        for(int i = s, j = 0; j < reArr.length; i++, j++){
            arr[i] = reArr[j];
        }
        String answer = Arrays.toString(arr);
        answer = answer.replace("," , "");
        answer = answer.replace("[" , "");
        answer = answer.replace("]" , "");

        return answer.replace(" ", "");
    }
}
