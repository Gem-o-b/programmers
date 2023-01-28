class Solution {
    public String solution(String s, int n) {
       String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int tmp=0;
            if (s.charAt(i)==' '){
               answer += ' ';
            }else if (Character.isUpperCase(s.charAt(i))){
               tmp = (int)s.charAt(i)+n;
               while (tmp > 90){
                   tmp -= 26;
               }
               answer += String.valueOf((char)tmp);
            }else{
                tmp = (int)s.charAt(i)+n;
                while (tmp > 122){
                    tmp -= 26;
                }
                answer += String.valueOf((char)tmp);
            }

        }



        return answer;
    }
}