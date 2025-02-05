package codingtraining;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
    	ArrayList<Integer> stk = new ArrayList<>();
    	for (int i = 0; i < arr.length; i++) {
			if(stk.isEmpty()) stk.add(arr[i]);
			else if(stk.get(stk.size()-1)<arr[i]) stk.add(arr[i]);
			else if(stk.get(stk.size()-1)>=arr[i]) stk.remove(stk.size()-1); stk.add(arr[i]);
    	} // for i
    	
    	int[]answer = new int[stk.size()]; // ArrayList -> 배열
    	for (int k = 0; k < stk.size(); k++) {
			answer[k]=stk.get(k);
		} // for i		
        return answer;
    }
}