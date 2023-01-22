import java.util.Arrays;
class Solution {
     public int solution(int[] array) {
        int answer = 0;
        int maxCount=0;

        int[] resultArr = Arrays.stream(array).distinct().toArray();

        for (int i = 0; i < resultArr.length; i++) {

            int tmp = resultArr[i];
            int tmpCount = (int)Arrays.stream(array).filter(c -> c == tmp).count();
            if (maxCount == tmpCount){
                answer = -1;
            }else if (maxCount < tmpCount){
                maxCount = tmpCount;
                answer = resultArr[i];
            }

        }

        return answer;
    }
}