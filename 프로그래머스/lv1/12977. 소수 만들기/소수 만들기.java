import java.util.*;
class Solution {
    public int solution(int[] nums) {
         int answer = 0;


        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sw=0;

                    for (int l = 1; l <= nums[i]+nums[j]+nums[k]; l++) {
                        int a =nums[i]+nums[j]+nums[k];
                        if(a%l==0 ){
                            
                            sw++;
                        }
                    }
                    if(sw==2){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}