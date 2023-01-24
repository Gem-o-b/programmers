class Solution {
      public int[] solution(int num, int total) {
            int midNum = total/num;
            int insNum=0;

            int[] answer = new int[num];
            if (num%2 ==0){
                insNum=midNum-(num/2-1);
                for(int i=0;i < answer.length; i++){
                    answer[i] = insNum;
                    insNum++;
                }
            }else{
                insNum=midNum-(num/2);
                for(int i=0;i < answer.length; i++){
                    answer[i] = insNum;
                    insNum++;
                }
            }
            return answer;
        }
}