import java.util.Arrays;

import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long[] arr = Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).mapToLong(i->Long.parseLong(i)).toArray();
        for (int i = 0; i < arr.length; i++) {
            answer *= 10;
            answer += arr[i];
        }
        return answer;
    }
}