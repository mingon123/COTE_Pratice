package clear.d0212;

/*
배열의 길이를 2의 거듭제곱으로 만들기

문제 설명
정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 1,000
1 ≤ arr의 원소 ≤ 1,000
입출력 예
arr	result
[1, 2, 3, 4, 5, 6]	[1, 2, 3, 4, 5, 6, 0, 0]
[58, 172, 746, 89]	[58, 172, 746, 89]
입출력 예 설명
입출력 예 #1

예제 1번의 arr의 길이는 6입니다. arr의 길이를 2의 정수 거듭제곱으로 만드는 방법은 0을 2개, 10개, 26개,..., 추가하는 방법이 있고 그중 최소한으로 0을 추가하는 방법은 2개를 추가하는 것입니다. 따라서 [1, 2, 3, 4, 5, 6, 0, 0]을 return 합니다.
입출력 예 #2

예제 2번의 arr의 길이는 4이고 이미 2의 정수 거듭제곱입니다. 따라서 뒤에 0을 추가하지 않아도 되므로 [58, 172, 746, 89]를 return 합니다.
 */

import java.util.ArrayList;
import java.util.List;

public class Lv0_112 {

	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (Integer integer : arr) list.add(integer);
		int length = 2; // 길이2
		while(arr.length>length) length*=2; // arr길이가 length보다 짧으면 length2배씩해서 2의 거듭제곱이 되도록.
		while(list.size() < length && list.size()!=1) list.add(0); // 그 수까지 0을 추가하는데, 2^0 1도 2의 거듭제곱이므로 1인 경우는 제외
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}

// 문제 요약 : arr의 '길이'가 2의 거듭제곱이 되도록 arr뒤에 정수 0추가. 0을 최소로 추가하여 배열반환
// 규칙 : 2 4 8 16 -> 2부터 2배씩 증가
