package codingtraining;
// 57

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        for (int i = 0; i < intStrs.length; i++) {
			int intStr = intStrs.toString().charAt(i)-'0';			

			
			if (intStr>k) answer[i] = Integer.toString(intStr).charAt(i);
			
			
			
		} // for i
        
        return answer;
    }
}