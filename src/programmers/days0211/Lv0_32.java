package programmers.days0211;

import java.util.ArrayList;

/*

문제 설명
정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ start_num ≤ end_num ≤ 50
입출력 예
start_num	end_num	     result
3	          10	     [3, 4, 5, 6, 7, 8, 9, 10]
 */
public class Lv0_32 {

	
	int start_num = 3;
	int end_num = 10;
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = start_num; i < end_num; i++) {
        	result.add(i);
        }
        
        return answer = result.stream().mapToInt(Integer::intValue).toArray();
    }
}
