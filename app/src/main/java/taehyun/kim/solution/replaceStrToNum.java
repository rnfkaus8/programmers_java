package taehyun.kim.solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class replaceStrToNum{
    public int solution(String s) {
        Map<String, Integer> englishStrToIntMap = createEngStrToIntMap();
        Iterator<String> iter = englishStrToIntMap.keySet().iterator();
        while(iter.hasNext()){
            String key = iter.next();
            s = s.replaceAll(key, englishStrToIntMap.get(key).toString());
        }
        return Integer.parseInt(s);
    }

    private Map<String, Integer> createEngStrToIntMap(){
        Map<String, Integer> resultMap = new HashMap<String, Integer>();
        resultMap.put("zero", 0);
        resultMap.put("one", 1);
        resultMap.put("two", 2);
        resultMap.put("three", 3);
        resultMap.put("four", 4);
        resultMap.put("five", 5);
        resultMap.put("six", 6);
        resultMap.put("seven", 7);
        resultMap.put("eight", 8);
        resultMap.put("nine", 9);
        return resultMap;
    }
}