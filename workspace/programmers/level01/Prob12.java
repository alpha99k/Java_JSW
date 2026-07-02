package level01;

public class Prob12 {
    void main(String[] args) {
        solution("love" , 4);
    }
    public String solution(String my_string, int k) {
        StringBuffer answer = new StringBuffer("");
        for(int i = 0; i < k; i++){
            answer.append(my_string);
        }
        System.out.println(answer);
        return answer.toString();
    }
}
