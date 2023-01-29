class Solution {
    public int solution(int n) {
       int answer =0;

        for (int i = 2; i <=n ; i++) {
            if (i==2||i==3||i==5||i==7){
                answer++;
                continue;
            }
            if(check(i)){
                answer++;
            }
        }
        return answer;
    }
    public boolean check(int num){
        for (int i = 2; i*i <=num ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
}