import java.util.Arrays;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
       sb.append(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().getAsInt()+" "+Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().getAsInt());
        return sb.toString();
    }
}