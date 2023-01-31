import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String before, String after) {
       
        List<String> list = new ArrayList<>();
        for (int i = 0; i < after.length(); i++) {
            list.add(String.valueOf(before.charAt(i)));
        }
        for (int i = 0; i < after.length(); i++) {

            int tmp = list.indexOf(String.valueOf(after.charAt(i)));
            if (tmp != -1) list.remove(tmp);
            
        }


        return list.size()==0?1:0;
    
    }
}