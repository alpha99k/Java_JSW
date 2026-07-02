class Solution2 {
    public int[] solution(int n) {
        int leng = 0;
        leng = n % 2 == 1 ? (n/2)+1 : (n/2);
        int[] answer = new int[leng];
        for(int i = 0, j = 1; i < leng; i++, j+=2){
            answer[i] = j;
        }
        return answer;
    }
}