package taehyun.kim.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescSortStr {

    /**
     * 문자열 내림차순으로 배치하기
     * str은 길이 1 이상인 문자열입니다.
     * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
     * @param s
     * @return
     */
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<String> paramStrList = new ArrayList<String>(Arrays.asList(s.split("")));
        Collections.sort(paramStrList, Collections.reverseOrder());

        for (String str : paramStrList) {
            answer.append(str);
        }
        return answer.toString();
    }
    
}
