package clear.d0213;

/*
숫자 찾기

문제 설명
정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < num < 1,000,000
0 ≤ k < 10
num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
입출력 예
num	k	result
29183	1	3
232443	4	4
123456	7	-1
입출력 예 설명
입출력 예 #1

29183에서 1은 3번째에 있습니다.
입출력 예 #2

232443에서 4는 4번째에 처음 등장합니다.
입출력 예 #3

123456에 7은 없으므로 -1을 return 합니다.
 */

public class Lv0_155 {
    public int solution(int num, int k) {
        String s = num + "";
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)-'0'==k) return i+1;	// count는 1부터여서 i+1
		} // for i
        return -1;
    }
}

//문제 요약 : num을 이루는 숫자 중 k가 있으면 num의 그 숫자가 있는 자리수 반환 없으면 -1 반환



