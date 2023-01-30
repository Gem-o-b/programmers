
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failPer = new double[N];
        List<Double> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int tmp = i;
            double totCnt = Arrays.stream(stages).filter(q-> q >= tmp ).count();
            double clearCnt = Arrays.stream(stages).filter(q-> q == tmp ).count();

             if(clearCnt==0){
                list.add(0.0);
            }else {
                list.add(clearCnt / totCnt);
            }
        }
        int rank = 1;

        for (int i = 0; i < N; i++) {
            double max = Collections.max(list);
            for (int j = 0; j <N ; j++) {
                if(list.get(j)==max){
                    answer[i] = j+1;
                    rank++;
                    list.set(j,-1.0);
                    break;
                }
            }


        }
       return answer;
    }
}