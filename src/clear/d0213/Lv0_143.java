package clear.d0213;

/*
연속된 수의 합

문제 설명
연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

제한사항
1 ≤ num ≤ 100
0 ≤ total ≤ 1000
num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
입출력 예
num	total	result
3	12	[3, 4, 5]
5	15	[1, 2, 3, 4, 5]
4	14	[2, 3, 4, 5]
5	5	[-1, 0, 1, 2, 3]
입출력 예 설명
입출력 예 #1

num = 3, total = 12인 경우 [3, 4, 5]를 return합니다.
입출력 예 #2

num = 5, total = 15인 경우 [1, 2, 3, 4, 5]를 return합니다.
입출력 예 #3

4개의 연속된 수를 더해 14가 되는 경우는 2, 3, 4, 5입니다.
입출력 예 #4

설명 생략
 */

import java.util.ArrayList;
import java.util.List;

public class Lv0_143 {
    public int[] solution(int num, int total) {
    	List<Integer> list = new ArrayList<>();
    	int n = total/num;
        int start = num%2==0 ? num/2-1 : num/2;	// 짝수면 -1
    	for (int i = n-start; i < n+num/2+1; i++) {	// total/num 으로 중앙 찾고 거기서 +-num/2개씩
			list.add(i);
		} // for i
    	return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

// 문제 요약 : 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 정렬 후 반환


