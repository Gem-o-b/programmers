import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.size() >= nums.length/2){
                break;
            }
            map.put(nums[i],i);
        }
        return map.size();
    }
}