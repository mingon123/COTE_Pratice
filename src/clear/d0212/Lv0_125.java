package clear.d0212;

/*
배열의 원소 삭제하기

문제 설명
정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 100
1 ≤ arr의 원소 ≤ 1,000
arr의 원소는 모두 서로 다릅니다.
1 ≤ delete_list의 길이 ≤ 100
1 ≤ delete_list의 원소 ≤ 1,000
delete_list의 원소는 모두 서로 다릅니다.
입출력 예
arr	delete_list	result
[293, 1000, 395, 678, 94]	[94, 777, 104, 1000, 1, 12]	[293, 395, 678]
[110, 66, 439, 785, 1]	[377, 823, 119, 43]	[110, 66, 439, 785, 1]
입출력 예 설명
입출력 예 #1

예제 1번의 arr의 원소 중 1000과 94가 delete_list에 있으므로 이 두 원소를 삭제한 [293, 395, 678]을 return 합니다.
입출력 예 #2

예제 2번의 arr의 원소 중 delete_list에 있는 원소는 없습니다. 따라서 arr 그대로인 [110, 66, 439, 785, 1]을 return 합니다.
 */

import java.util.ArrayList;
import java.util.List;

public class Lv0_125 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);
        for (int del : delete_list) list.remove(Integer.valueOf(del)); // delete_list를 반복하며 list에 del에 해당하는 값이 있으면 제거
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

// 문제 요약 : arr 배열에서 delete_list의 원소를 모두 삭제, arr 순서 유지
