package clear.d0208;


/*
2의 영역

문제 설명
정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.

단, arr에 2가 없는 경우 [-1]을 return 합니다.

제한사항
1 ≤ arr의 길이 ≤ 100,000
1 ≤ arr의 원소 ≤ 10
입출력 예
arr	result
[1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
[1, 2, 1]	[2]
[1, 1, 1]	[-1]
[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
입출력 예 설명
입출력 예 #1

2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.
입출력 예 #2

2가 한 개뿐이므로 [2]를 return 합니다.
입출력 예 #3

2가 배열에 없으므로 [-1]을 return 합니다.
입출력 예 #4

2가 있는 인덱스는 1번, 3번, 6번 인덱스이므로 1번부터 6번 인덱스까지의 부분 배열인 [2, 1, 2, 1, 10, 2]를 return 합니다.
 */
import java.util.ArrayList;
import java.util.List;

public class Lv0_75 {
    public int[] solution(int[] arr) {
    	List<Integer> list = new ArrayList<>();
    	
    	// list에 arr값 채우기
    	for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
    	
    	// 2가 있으면 2~2까지 잘라서 반환 없으면 1반환
    	if(list.contains(2)) list = list.subList(list.indexOf(2), list.lastIndexOf(2)+1);
    	else return new int[]{-1};
    	
    	// List -> int[]
    	return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

// 문제 요약 : arr 안에 2가 포함된 가장 작은 연속된 부분을 return, 없으면 -1리턴
//			2가 하나면 2만, 2가 여러개면 첫번째2~마지막2사이의 값 반환




