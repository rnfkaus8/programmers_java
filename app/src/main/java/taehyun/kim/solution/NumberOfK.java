package taehyun.kim.solution;

import java.util.Arrays;

public class NumberOfK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
    	for(int i = 0; i < commands.length; i++) {
    		int start = 0;
    		int end = 0;
   			start = commands[i][0]-1;
   			end = commands[i][1];
            int[] tmp = Arrays.copyOfRange(array, start, end);
    		Arrays.sort(tmp);
    		answer[i] = tmp[commands[i][2]-1];
    	} 
    	
    	return answer;
    }
    
}
