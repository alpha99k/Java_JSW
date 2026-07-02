package level01;

public class Prob14 {    void main(String[] args) {
    solution(1,2);
}
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String tmp1 = str1 + str2;
        String tmp2 = str2 + str1;
        int ans1 = Integer.parseInt(tmp1);
        int ans2 = Integer.parseInt(tmp2);
        if(ans1 < ans2){
            answer = ans2;
        } else {
            answer = ans1;
        }
        return answer;
    }
}
