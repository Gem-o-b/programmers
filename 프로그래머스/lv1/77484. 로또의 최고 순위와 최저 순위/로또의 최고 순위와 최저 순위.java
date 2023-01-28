class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int ok =7;
        int no =1;
        boolean okCheck=false;
        for (int i = 0; i < 6; i++) {
            okCheck=false;
            if (lottos[i]==0){
                ok--;
                no++;
                okCheck=true;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i]==win_nums[j]){
                    System.out.println(lottos[i]);
                    ok--;
                    okCheck=true;
                    break;
                }
            }
            if (!okCheck){
                no++;
            }

        }
        if(ok ==7){
            ok=6;
        }
        if (no == 7) {
            no=6;
        }
        int[] answer = {ok,no};
        return answer;
    }
}