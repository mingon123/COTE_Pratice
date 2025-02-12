package codingtraining;

class Solution {
    public int solution(String[] order) {
    	int answer = 0;
        for (String string : order) {
        	if (string.contains("cafelatte")) answer += 5000;
        	else answer += 4500;
		} // foreach
        return answer;
    }
}

// 문제 요약 : 아메리카노 : 4500, 카페 라테 : 5000 아무거나 : 아메리카노
//			결제 금액(총액) 반환
// 			마지막 글자 - americano, cafelatte, anything

// 132


