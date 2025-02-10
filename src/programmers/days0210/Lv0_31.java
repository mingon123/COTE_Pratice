package programmers.days0210;

import java.util.ArrayList;

/*
문제 설명
정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

제한사항
1 ≤ l ≤ r ≤ 1,000,000
입출력 예
l	r	result
5	555	[5, 50, 55, 500, 505, 550, 555]
10	20	[-1]
 */
public class Lv0_31 {
	int l = 5;
	int r = 555;


	public int [] solution(int l, int r) {
		
		
		int num;
		ArrayList<Integer> result = new ArrayList<Integer>();
	   
		
		for(int i = l; i <= r; i++) {
			if(isTrue(i)) {
				result.add(i);
			}
		}
	    if(result.isEmpty()) {
				
	    	  result.add(-1);
			}
			
	    int [] answer = result.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}

	public boolean isTrue(int num) {
		
		 String strNum = Integer.toString(num);
		
		 for(char c : strNum.toCharArray()) {
			 if(c != '5' && c != '0') {
				 return false;
			 }
		 }
		 return true;
	
	}
	
}
