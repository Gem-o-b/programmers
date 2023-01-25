class Solution {
    public int solution(int n) {
       int answer = 0;
        int total =1;
        while(n != total){
            if (total*(answer+1) > n){
                break;
            }
            total *=++answer;
        }
        if (answer==0){
            answer=1;
        }
        return answer;
    }
}