import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
    int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(list.get(list.size()-1)==arr[i]){
                continue;
            }else{
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}