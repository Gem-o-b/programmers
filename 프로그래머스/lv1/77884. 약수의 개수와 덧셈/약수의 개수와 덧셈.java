class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int tmpCount = 0;
        for (int i = left; i <= right ; i++) {
            tmpCount =0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    tmpCount++;
                }

            }
            answer = tmpCount%2==0?answer+i:answer-i;

        }

        
        return answer;
    }
}