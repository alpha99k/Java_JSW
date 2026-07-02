package level01;

public class Prob17 {
    public int solution(int number, int n, int m) {
        int answer = (number%n != 0) ? 0 : (number%m != 0) ? 0 : 1;
        return answer;
    }
}
