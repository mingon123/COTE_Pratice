class Solution {
	public String solution(int[] numbers, String hand) {
		StringBuffer answer = new StringBuffer();
		int[] Lnumber = new int[] {3,0}, Rnumber = new int[] {3,2};
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