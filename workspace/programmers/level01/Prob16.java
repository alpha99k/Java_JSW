package level01;

public class Prob16 {
    public int solution(int num, int n) {
        int answer = 0;
        if(num%n == 0){
            answer++;
        }
        return answer;
    }
}
