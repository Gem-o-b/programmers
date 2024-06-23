import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> present = new HashMap<>();
        Map<String, Integer> giftCnt = new HashMap<>();


        for (String firend : friends){
            present.put(firend, 0);
            giftCnt.put(firend, 0);
        }


        for (String gift : gifts) {
            String[] split = gift.split(" ");
            String send = split[0];
            String receive = split[1];
            present.compute(send, (key, sendCnt) -> sendCnt + 1);
            present.compute(receive, (k, receiveCnt) -> receiveCnt - 1);
        }

        List<String> giftList = Arrays.asList(gifts);

        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String friend = friends[i];
                String friendSecond = friends[j];
                if (friend.equals(friendSecond))
                    continue;

                int friendCnt = Collections.frequency(giftList, friend + " " + friendSecond);
                int friendSecondCnt = Collections.frequency(giftList, friendSecond + " " + friend);

                if (friendCnt > friendSecondCnt) {
                    giftCnt.compute(friend, (k, v) -> v + 1);
                } else if (friendCnt == friendSecondCnt) {
                    if(present.get(friend) > present.get(friendSecond))
                        giftCnt.compute(friend, (k, v) -> v + 1);
                    else if (present.get(friend) < present.get(friendSecond)) {
                        giftCnt.compute(friendSecond, (k, v) -> v + 1);
                    }
                }else {
                    giftCnt.compute(friendSecond, (k, v) -> v + 1);
                }
            }
        }
        
        answer = Collections.max(giftCnt.values());


        return answer;
    }
}