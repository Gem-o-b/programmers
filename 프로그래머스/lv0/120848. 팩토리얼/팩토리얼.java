class Solution {
    public int solution(int n) {
       int answer = 0;
        int total =1;
        while(true){
            if (total*(answer+1) > n){
                break;
            }
            total *=++answer;
        }
       
        return answer;
    }
}