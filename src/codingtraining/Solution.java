package codingtraining;

import java.util.*;

class Solution {
	public String solution(int[] numbers, String hand) {
		StringBuffer answer = new StringBuffer();
		int[] Lnumber = {3,0}, Rnumber = {3,2};
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%3==1) {
				answer.append("L");
				Lnumber = getNumber(numbers[i]);
			}
			else if(numbers[i]%3==0 && numbers[i]!=0) {
				answer.append("R");
				Rnumber = getNumber(numbers[i]);
			}

			else {
				int[] number = getNumber(numbers[i]);
				int lNum = Math.abs(Lnumber[0]-number[0]) + Math.abs(Lnumber[1]-number[1]);
				int rNum = Math.abs(Rnumber[0]-number[0]) + Math.abs(Rnumber[1]-number[1]);

				if(lNum == rNum) {
					if(hand.equals("right")){
						answer.append("R");
						Rnumber = getNumber(numbers[i]);
					} else {
						answer.append("L");
						Lnumber = getNumber(numbers[i]);
					}
				}
				else if(lNum < rNum) {
					answer.append("L");
					Lnumber = getNumber(numbers[i]);
				}
				else {
					answer.append("R");
					Rnumber = getNumber(numbers[i]);
				}
			}
		} // for i
		return new String(answer);
	}

	private int[] getNumber(int num) {
		int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{-2,0,-3}};
		for (int i = 0; i < keypad.length; i++) {
			for (int j = 0; j < keypad[i].length; j++) {
				if(keypad[i][j] == num) return new int[]{i,j};				
			} // for j
		} // for i
		return new int[] {-1,-1};
	}
}


// 손가락은 상하좌우만 이동 
// 시작 위치 : * , #
// left : 1,4,7  right : 3,6,9
// 가운데 : 2,5,8,0 가까운 손가락. 같다면 오른손잡이 : right, 왼손잡이 : left
// numbers : 누를 번호, hand : 주 손
// return : 누른 손가락 순서 L<->R



// 5 - lv1
// 170 - lv0


