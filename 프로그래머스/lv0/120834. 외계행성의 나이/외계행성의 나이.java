class Solution {
    public String solution(int age) {
      String tmp = "";
        while(age>0){
            tmp +=(char)(age%10+97);
            age /=10;
        }
        StringBuilder sb = new StringBuilder(tmp);
        return sb.reverse().toString();
    }
}