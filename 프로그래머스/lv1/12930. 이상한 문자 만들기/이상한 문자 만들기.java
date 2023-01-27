class Solution {
    public String solution(String s) {
         String answer = "";
            int num =0;
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (tmp ==' ' ){
                    num =0;
                    answer += " ";
                    continue;
                }else if (num%2==0){
                    answer += String.valueOf(tmp).toUpperCase();

                }else{
                    answer += String.valueOf(tmp).toLowerCase();
                }
                num++;

            }

            return answer;
    }
}