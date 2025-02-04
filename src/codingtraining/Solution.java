package codingtraining;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    	int[] answer = {};
    	for (int i = 0; i < arr.length-1; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];
						
			for (int j = 0; j < arr.length-1; j++) {
				if (s<=i && i<=e) {
					if (k<arr[i]) {
						answer = arr;
					} // if
				} // if
			} // for j
		} // for i
        return answer;
    }
}