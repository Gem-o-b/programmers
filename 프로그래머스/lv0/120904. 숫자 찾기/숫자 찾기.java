import java.util.Arrays;
class Solution {
    public int solution(int num, int k) {
       int answer = 0;
        int[] sNum = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < sNum.length; i++) {
            if(sNum[i]==k){
                return i+1;

            }
        }
        return -1;
    }
}