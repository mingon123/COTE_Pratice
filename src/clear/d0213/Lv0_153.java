package clear.d0213;

/*
자릿수 더하기

문제 설명
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

제한사항
0 ≤ n ≤ 1,000,000
입출력 예
n	result
1234	10
930211	16
입출력 예 설명
입출력 예 #1

1 + 2 + 3 + 4 = 10을 return합니다.
입출력 예 #2

9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
 */

public class Lv0_153 {
    public int solution(int n) {
        String s = n + "";
        int answer = 0;
        for (int i = 0; i < s.length(); i++) answer += s.charAt(i)-'0';
    	return answer;
    }
}

//문제 요약 : n의 각 자리 숫자의 합을 리턴

