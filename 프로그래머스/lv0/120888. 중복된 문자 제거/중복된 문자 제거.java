import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
       return Arrays.stream(my_string.split("")).reduce("", (a, b) -> a + (b = (!a.contains(b)) ? b : "")).toString();
    }
}