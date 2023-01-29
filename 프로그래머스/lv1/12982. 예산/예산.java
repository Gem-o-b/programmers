import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int total =0;
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(total +d[i] > budget){
                break;

            }

            total+=d[i];
            answer++;
        }


        return answer;
    }
}