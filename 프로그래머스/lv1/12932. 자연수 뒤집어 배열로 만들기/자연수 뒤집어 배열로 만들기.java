import java.util.Arrays;


class Solution {
    public int[] solution(long n) {
        
       int[] answer = Arrays.stream(String.valueOf(n).split("")).mapToInt(i->Integer.parseInt(i)).toArray();
        int[] tmp =new int[answer.length];

        for (int i = answer.length-1; i >=0 ; i--) {
            tmp[answer.length-i-1] += answer[i];
        }
        return tmp;
    
    }
}