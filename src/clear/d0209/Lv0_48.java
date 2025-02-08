package clear.d0209;

/*
배열 만들기 2

문제 설명
정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

제한사항
1 ≤ l ≤ r ≤ 1,000,000
입출력 예
l	r	result
5	555	[5, 50, 55, 500, 505, 550, 555]
10	20	[-1]
입출력 예 설명
입출력 예 #1

5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
입출력 예 #2

10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.
 */

import java.util.ArrayList;
import java.util.List;

public class Lv0_48 {
	public int[] solution(int l, int r) {
		List<Integer> list = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			if(String.valueOf(i).matches("[05]+")) list.add(i); // i번째 값이 0이나 5로 이루어졌으면 추가
		}
		return list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(Integer::intValue).toArray(); // 비어있으면 -1 반환, 값이있으면 int[]로 반환
	}
}

// 문제 요약 : arr 안에 2가 포함된 가장 작은 연속된 부분을 return, 없으면 -1리턴
//				2가 하나면 2만, 2가 여러개면 첫번째2~마지막2사이의 값 반환




