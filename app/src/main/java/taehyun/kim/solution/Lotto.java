package taehyun.kim.solution;

import java.util.HashMap;
import java.util.Map;

import org.checkerframework.checker.units.qual.min;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        final int NUM_FOR_LOTTO_RANK = 7;
        Map<Integer, Integer> win_nums_map = new HashMap<Integer, Integer>();
        for (int win_num : win_nums) {
            win_nums_map.put(win_num, 1);
        }
        int unknownLottosCnt = 0;
        int collectLottoNumCnt = 0;
        for (int lotto : lottos) {
           if(lotto == 0){
               unknownLottosCnt++;
               continue;
           }
           collectLottoNumCnt += win_nums_map.getOrDefault(lotto, 0);
        }
        int maxRank = NUM_FOR_LOTTO_RANK - unknownLottosCnt - collectLottoNumCnt;
        int minRank = NUM_FOR_LOTTO_RANK - collectLottoNumCnt;
        return new int[] {maxRank > 6 ? 6 : maxRank, minRank > 6 ? 6 : minRank};
    }
}
