package codingtraining;

class Solution {
    public String solution(String n_str) {
    	String answer = n_str;
    	for (int i = 0; i < n_str.length(); i++) {
    		if(n_str.startsWith("0") && n_str.charAt(i) == 0) answer = n_str.substring(i);
		} // for i
    	return answer;
    }
}

// 문제 요약 : 가장 왼쪽에 처음으로 등장하는 0을들 뗀 문자열 리턴
// 122


