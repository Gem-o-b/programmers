import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(String.valueOf(my_string).replaceAll("[a-z]","").split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}