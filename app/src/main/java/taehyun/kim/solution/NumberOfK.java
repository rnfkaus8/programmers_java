package taehyun.kim.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOfK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
    	for(int i = 0; i < commands.length; i++) {
    		List<Integer> tmp = new ArrayList<Integer>();
    		int start = 0;
    		int end = 0;
   			start = commands[i][0]-1;
   			end = commands[i][1];
    		for (int j = start; j < end; j++) {
				tmp.add(array[j]);
			}
    		Collections.sort(tmp);
    		answer[i] = tmp.get(commands[i][2]-1);
    	} 
    	
    	return answer;
    }
    
}
