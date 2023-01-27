import java.util.Arrays;
class Solution {
    public boolean solution(int x) {
        return x%Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).reduce(0,(a,b)->a+b)==0?true:false;
    }
}