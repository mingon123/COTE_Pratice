package clear.d0208;


/*
카운트 다운

문제 설명
정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ end_num ≤ start_num ≤ 50
입출력 예
start_num	end_num	result
10	3	[10, 9, 8, 7, 6, 5, 4, 3]
입출력 예 설명
입출력 예 #1

10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.
 */

import java.util.ArrayList;

public class Lv0_70 {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = start_num; i >= end_num; i--) { // 10~3까지 반복
			al.add(start_num--); // -1씩감소하면서 저장
		}

        // al -> int[]
        int [] answer = new int [al.size()]; 
        for (int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);
		}
        return answer;
    }
}

// 문제 요약 : start_num~end_num까지 1씩 감소하는 수들을 반환


// arraylist 사용X
class Solution {
    public int[] solution(int start_num, int end_num) {
    	int [] answer = new int [start_num-end_num+1]; // 10~3까지 범위
    	int idx = 0; // 인덱스번호는 i로 하면 범위 벗어남
        for (int i = start_num; i >= end_num; i--) answer[idx++] = start_num--; // 상동
        return answer;
    }
}

// 이렇게도 풀 수 있음


