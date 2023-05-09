import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int a = 0;
        int b = people.length-1;
        int solo = 0;
        int two = 0;
        while (a <= b){
            if (people[a]+people[b] > limit){
                solo++;
                b--;
            }else{
                two++;
                a++;
                b--;
            }
        }
        return two+solo;
    }
}