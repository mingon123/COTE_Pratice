package clear.d0213;

/*
7의 개수

문제 설명
머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array의 원소 ≤ 100,000
입출력 예
array	result
[7, 77, 17]	4
[10, 29]	0
입출력 예 설명
입출력 예 #1

[7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.
입출력 예 #2

[10, 29]에는 7이 없으므로 0을 return 합니다.
 */

public class Lv0_147 {
    public int solution(int[] array) {
        int cnt = 0;
    	for (int i : array) {
			String str = String.valueOf(i);	// 각 값을 int -> String
			for (char c : str.toCharArray()) { // str -> char 한 글자로 잘라서 배열로 만듦
				if(c=='7') cnt++; // 그게 char'7'이면 1증가
			} // foreach
		} // foreach
    	return cnt;
    }
}

//문제 요약 : array에서 7 개수 리턴


