import java.util.Arrays;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftHand =10;
        int rightHand =12;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==0) numbers[i] =11;
            if (numbers[i]==1||numbers[i]==4||numbers[i]==7) {
                sb.append("L");
                leftHand =numbers[i];

            }else if (numbers[i]==3||numbers[i]==6||numbers[i]==9) {

                sb.append("R");
                rightHand=numbers[i];
            }else{
                int left = numbers[i]>leftHand?numbers[i]-leftHand:leftHand-numbers[i];
                int right = numbers[i]>rightHand?numbers[i]-rightHand:rightHand-numbers[i];
                int leftDis = (left/3)+(left%3); //1
                int rightDis = (right/3)+(right%3);

                if(leftDis== rightDis){
                    if(hand.equals("left")){
                        sb.append("L");
                        leftHand =numbers[i];
                    }else{
                        sb.append("R");
                        rightHand=numbers[i];
                    }
                }else if(leftDis <  rightDis){
                    sb.append("L");
                    leftHand =numbers[i];
                }else{
                    sb.append("R");
                    rightHand=numbers[i];
                }

            }




        }


        return sb.toString();
    }
}