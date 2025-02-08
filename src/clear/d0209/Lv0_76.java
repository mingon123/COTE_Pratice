package clear.d0209;

/*
배열 조각하기

문제 설명
정수 배열 arr와 query가 주어집니다.

query를 순회하면서 다음 작업을 반복합니다.

짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.

제한사항
5 ≤ arr의 길이 ≤ 100,000
0 ≤ arr의 원소 ≤ 100
1 ≤ query의 길이 < min(50, arr의 길이 / 2)
query의 각 원소는 0보다 크거나 같고 남아있는 arr의 길이 보다 작습니다.
입출력 예
arr	query	result
[0, 1, 2, 3, 4, 5]	[4, 1, 2]	[1, 2, 3]
입출력 예 설명
입출력 예 #1

이번에 매번 처리할 query의 값과 처리 전후의 arr의 상태를 표로 나타내면 다음과 같습니다.
query의 값	query 처리 전	query 처리 후	비고
4	[0, 1, 2, 3, 4, 5]	[0, 1, 2, 3, 4]	0번 인덱스의 쿼리이므로 뒷부분을 자른다.
1	[0, 1, 2, 3, 4]	[1, 2, 3, 4]	1번 인덱스의 쿼리이므로 앞부분을 자른다.
2	[1, 2, 3, 4]	[1, 2, 3]	2번 인덱스의 쿼리이므로 뒷부분을 자른다.
따라서 [1, 2, 3]을 return 합니다.
 */
import java.util.ArrayList;
import java.util.List;

public class Lv0_76 {
	public int[] solution(int[] arr, int[] query) {
		List<Integer> list = new ArrayList<>();
		for (int i : arr) list.add(i);	// list에 arr 값 복사

		for (int i = 0; i < query.length; i++) {
			if(i%2==0) list = list.subList(0, query[i]+1); // 짝수 [주의] 조건과 반대로 해야함. 필요한 데이터를 자르는 것이기 때문
			else list = list.subList(query[i], list.size()); // 홀수
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}

// 문제 요약 : query==짝수 : arr에서 query[i]+1부터 뒤 삭제
//			query==홀수 : arr에서 query[i]-1부터 앞 삭제






















