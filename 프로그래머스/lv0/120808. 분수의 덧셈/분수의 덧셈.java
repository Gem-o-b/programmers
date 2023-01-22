class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1*denom2)+(numer2*denom1);
        int denom = denom1*denom2;
        int minNumber = denom> numer ?numer:denom;
        int[] answer = {0,0};

        while(true){
            if(denom%minNumber==0){
                if(numer%minNumber==0){
                    answer[1]=denom/minNumber;
                    answer[0]=numer/minNumber;
                    break;
                }
            }
            minNumber--;
        }


        return answer;
    }
}