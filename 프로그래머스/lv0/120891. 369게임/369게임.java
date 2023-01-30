class Solution {
    public int solution(int order) {
         int answer = 0;
        String[] sOrder = String.valueOf(order).split("");
        for (int i = 0; i < sOrder.length; i++) {
            if(sOrder[i].equals("3")||sOrder[i].equals("6")||sOrder[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}