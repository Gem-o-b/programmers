class Solution {
    public int[] solution(int[] array) {
       int[] answer = {0,0};
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            
            if (array[tmp] < array[i]){
                tmp = i;

            }

        }
        answer[0] = array[tmp];
        answer[1] = tmp;
        return answer;
    }
}