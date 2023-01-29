class Solution {
    public int[] solution(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[tmp] < array[i]){
                tmp = i;
            }
        }
        int[] answer = {array[tmp],tmp};
        return answer;
    }
}