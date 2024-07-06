class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, sequence.length};
        int start = 0;
        int end = 1;
        int sum = sequence[0];
        while (start < end) {
            if (k == sum) {
                if (answer[1] - answer[0] > end-1 - start) {
                    answer = new int[]{start, end-1};
                }
                sum -= sequence[start];
                start++;
            } else if (k < sum) {
                sum -= sequence[start];
                start++;
            } else if(end < sequence.length) {
                sum += sequence[end];
                end++;

            }else{
                break;
            }
        }
        return answer;
    }
}