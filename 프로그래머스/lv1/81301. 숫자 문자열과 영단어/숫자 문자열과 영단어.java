class Solution {
    public int solution(String s) {
         String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] arr2 = {"0","1","2","3","4","5","6","7","8","9"};

        for (int i = 0; i < arr.length; i++) {
           s= s.replace(arr[i],arr2[i]);
        }


        return Integer.parseInt(s);
    }
}