public class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
    	int count = 0;
    	for (int i = 0; i < schedules.length; i++) {
    		int late;
    		if(schedules[i]%100 < 50) late = schedules[i] + 10;
    		else late = schedules[i] + 50;                      
  
			boolean l = true;
			int day = startday;
			for (int j = 0; j < 7; j++) {
				if(day==6 || day==7) {
					day = (day%7)+1;
					continue;
				}
				if(timelogs[i][j] > late) { 
					l = false;
					break;
				}
				day = (day%7)+1;
			} // for j
			if(l) count++;
		} // for i
    	return count;
    }
}