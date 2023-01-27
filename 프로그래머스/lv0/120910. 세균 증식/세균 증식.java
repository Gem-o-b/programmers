import java.util.stream.IntStream;
class Solution {
    public int solution(int n, int t) {
               return IntStream.rangeClosed(1,t).reduce(n,(a,b)->a*2);
    }
}