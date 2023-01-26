class Solution {
    public int solution(int n) {
          int answer = 2;
        int i =0;
        while (i*i <= n){
            if (i*i ==n){
                answer=1;
            }
            i++;
        }
        return answer;
    }
}