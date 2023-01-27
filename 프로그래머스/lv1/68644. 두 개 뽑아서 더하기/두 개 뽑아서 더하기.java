import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
       int arrCnt = 0;
        for (int i = 0; i < numbers.length; i++) {
             arrCnt +=i;
        }

        int[] answer = new int[arrCnt];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                answer[count] = numbers[i]+numbers[j];
                count++;
            }

        }

        return Arrays.stream(answer).distinct().sorted().toArray();
    }
}