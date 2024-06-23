import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        int sortNum = switch (sort_by) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        answer = valExtCheck(data, val_ext, ext);

        Arrays.sort(answer, (o1, o2) -> {
            return o1[sortNum] - o2[sortNum];
        });
        
        return answer;
    }

    public int[][] valExtCheck(int[][] answer, int val_ext, String ext) {

        ArrayList<int[]> list = new ArrayList<>();

        int extNum = switch (ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        for (int i = 0; i < answer.length; i++) {
            if (answer[i][extNum] < val_ext) {
                list.add(answer[i]);
            }
        }

        answer = list.toArray(new int[list.size()][]);

        return answer;
    }

}
