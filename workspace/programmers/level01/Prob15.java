package level01;

public class Prob15 {
    void main(String[] args) {
        solution(1,2);
    }
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String tmp1 = str1 + str2;
        int ans1 = Integer.parseInt(tmp1);
        int ans2 = 2 * a * b;
        answer = Math.max(ans1,ans2);
        return answer;
    }
}
