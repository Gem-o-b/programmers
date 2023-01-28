import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder br = new StringBuilder();
        for(char str:c){
            br.append(str);
        }
        return br.reverse().toString();
    }
}