package clear.d0208;

import java.util.ArrayList;

public class Lv0_72 {
	public int[] solution(int n, int[] slicer, int[] num_list) {
		ArrayList<Integer> al = new ArrayList<>();

		// 조건문
		if (n==1) {
			for (int i = 0; i <= slicer[1]; i++) al.add(num_list[i]);
		}
		else if (n==2) {
			for (int i = slicer[0]; i < num_list.length; i++) al.add(num_list[i]); // 주의 <=아닌 <로 해야함
		}
		else if (n==3) {
			for (int i = slicer[0]; i <= slicer[1]; i++) al.add(num_list[i]);
		}
		else if (n==4) {
			for (int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) al.add(num_list[i]);
		}

		// al->int[]
		int[] answer = new int [al.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = al.get(i);
		}
		return answer;
	}
}

//문제 요약 : slicer[0] : a, slicer[1] : b, slicer[2] : c, 아래 규칙에 따라 num_list 슬라이싱
//n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
//n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
//n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
//n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로