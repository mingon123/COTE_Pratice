package programmers.days0207;

import java.util.Arrays;

/*

문제 설명
정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9
입출력 예
num_list	    result
[2, 1, 6]	    [2, 1, 6, 5]
[5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]
 */
public class Lv0_25 {

	//		int [] num_list = {2, 1, 6};
	//		
	public static int [] solution(int[] num_list) {

		int [] num2_list = {};
		int[] answer = {};
		int last; // 배열의 마지막 원소
		int before; // 마지막 원소 전 원소
		int addLast; // 추가한 마지막 원소
		num2_list = Arrays.copyOf(num_list,num_list.length + 1); // 배열 한칸 복사

		last = num_list[num_list.length-1]; // 배열의 마지막 원소
		before = num_list[num_list.length-2]; // 배열의 마지막 원소 전 원소


		if(last > before) {

			addLast = last - before;
			num2_list[num2_list.length - 1] = addLast; // 복사한 배열에 값 할당하기
			answer = num2_list;

		}
		else {
			addLast = last * 2;
			num2_list[num2_list.length - 1] = addLast; // 복사한 배열에 값 할당하기
			answer = num2_list;

		}
		return answer;
	}


}
