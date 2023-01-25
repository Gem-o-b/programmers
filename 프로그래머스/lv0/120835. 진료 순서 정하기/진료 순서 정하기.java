class Solution {
    public int[] solution(int[] emergency) {
        int[] tmp = new int [emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            int count=1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]){
                    count++;
                }
            }
            tmp[i] = count;
        }

        return tmp;
    }
}