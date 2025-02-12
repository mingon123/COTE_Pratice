package codingtraining;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int num, int total) {
    	List<Integer> list = new ArrayList<>();

    	return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

//문제 요약 : 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 정렬 후 반환

// 143


