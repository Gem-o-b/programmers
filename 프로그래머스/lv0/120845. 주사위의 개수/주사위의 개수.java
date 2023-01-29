import java.util.Arrays;
class Solution {
    public int solution(int[] box, int n) {
        return Arrays.stream(box).reduce(1,(a,b)->a*(b/n));
    }
}