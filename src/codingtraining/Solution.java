package codingtraining;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        for (Integer integer : arr) list.add(integer);
        while(list.size() <= (i&(i-1))) {
        	list.add(0);
        	i++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

// 문제 요약 : arr의 '길이'가 2의 거듭제곱이 되도록 arr뒤에 정수 0추가. 0을 최소로 추가하여 배열반환



// 112


