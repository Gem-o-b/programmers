import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
         int tmp =0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {

            if(Math.abs(array[i]-n) < Math.abs(array[tmp]-n)){
                tmp =i;
            }
        }
        return array[tmp];
    }
}