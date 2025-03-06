package codingtraining;

import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
    	String answer = "";
    	String current = answer.substring(answer.length()-1);
    	for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) answer += "L";
			else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) answer += "R";
			else {
				if(current == "L") answer+="L";
				else if(current =="R") answer+="R";				
			}
    		
    		
    		
    		
		} // for i
        return answer;
    }
}


// 손가락은 상하좌우만 이동 
// 시작 위치 : * , #
// left : 1,4,7  right : 3,6,9
// 가운데 : 2,5,8,0 가까운 손가락. 같다면 오른손잡이 : right, 왼손잡이 : left
// numbers : 누를 번호, hand : 주 손
// return : 누른 손가락 순서 L<->R


// 46 - 키패드

// 5 - lv1
// 170 - lv0


