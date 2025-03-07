class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
    	int videoLen = getTime(video_len);
    	int postime = getTime(pos);
    	int opStart = getTime(op_start);
    	int opEnd = getTime(op_end);

    	for (int i = 0; i < commands.length; i++) {
        	if(opStart <= postime && postime <= opEnd) postime = opEnd;
        	
			if(commands[i].equals("prev")) {
				if(postime<10) postime = 0;
				else postime-=10;
			} else if(commands[i].equals("next")) {
				if(videoLen-postime<10) postime = videoLen;
				else postime+=10;
			}
			
			if(opStart <= postime && postime <= opEnd) postime = opEnd;
		} // for i
        
    	String min = postime/60 + "";
    	String sec = postime%60 + "";
    	if(min.length()==1) min = "0" + min;
    	if(sec.length()==1) sec = "0" + sec;
    	
    	String answer = min + ":" + sec;
    	
    	return answer;
    }
    
    private static int getTime(String time) {
    	String[] timeArr = time.split(":");
    	return Integer.parseInt(timeArr[0])*60 + Integer.parseInt(timeArr[1]);
    }
}