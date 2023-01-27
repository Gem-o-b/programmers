import java.time.LocalDate;
class Solution {
    public String solution(int a, int b) {
       LocalDate ld = LocalDate.of(2016,a,b);
        int date = ld.getDayOfWeek().getValue();
        switch (date){
            case 1:
                return "MON";
            case 2:
                return "TUE";
            case 3:
                return "WED";
            case 4:
                return "THU";
            case 5:
                return "FRI";
            case 6:
                return "SAT";
            case 7:
                return "SUN";
        }
        return "ERR";
    }
}