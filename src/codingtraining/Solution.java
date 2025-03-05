package codingtraining;

import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
    	int count = 0;
    	int late;
    	for (int i = 0; i < schedules.length; i++) {
    		if(schedules[i]%100 <= 50) late = schedules[i] + 10;    			
    		else late = schedules[i] + 100 - 60 + (60-schedules[i]%100);
  
			boolean l = false;
			
			for (int j = 0; j < timelogs[i].length; j++) {
				if(startday<=5 && timelogs[i][j] <= late) {
					l = true;
				} else {
					l = false;
					break;
				};
			} // for j
			if(l) count++;
		} // for i
    	return count;
    }
}


// 12
// 170


