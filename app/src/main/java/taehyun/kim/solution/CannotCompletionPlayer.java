package taehyun.kim.solution;

import java.util.HashMap;
import java.util.Map;

public class CannotCompletionPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantCntMap = new HashMap<String, Integer>();
        for (String participantPlayer : participant) {
            int cnt = participantCntMap.getOrDefault(participantPlayer, 0);
            participantCntMap.put(participantPlayer, ++cnt);
        }
        for (String completPlayer : completion){
            int cnt = participantCntMap.get(completPlayer);
            participantCntMap.put(completPlayer, --cnt);
        }

        for(String participantPlayer : participant){
            if(participantCntMap.get(participantPlayer) == 1){
                answer = participantPlayer;
                break;
            }
        }

        return answer;
    }
}
