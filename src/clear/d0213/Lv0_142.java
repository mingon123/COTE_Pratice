package clear.d0213;

/*
다음에 올 숫자

문제 설명
등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

제한사항
2 < common의 길이 < 1,000
-1,000 < common의 원소 < 2,000
common의 원소는 모두 정수입니다.
등차수열 혹은 등비수열이 아닌 경우는 없습니다.
등비수열인 경우 공비는 0이 아닌 정수입니다.
입출력 예
common	result
[1, 2, 3, 4]	5
[2, 4, 8]	16
입출력 예 설명
입출력 예 #1

[1, 2, 3, 4]는 공차가 1인 등차수열이므로 다음에 올 수는 5이다.
입출력 예 #2

[2, 4, 8]은 공비가 2인 등비수열이므로 다음에 올 수는 16이다.
 */

public class Lv0_142 {
    public int solution(int[] common) {
        int i = common[1]-common[0];  // 0,1,2 크기비교
        int j = common[0]!=0 ? common[1]/common[0] : 0; // common[0] 이 0이면 오류나서 아닐때만 나누도록
        
    	if(common[2]-common[1]==i) return common[common.length-1] + i; // 마지막값에 + 규칙(차이)
    	else return common[common.length-1] * j; // 마지막값에 *규칙(차이)
    }
}

//문제 요약 : 등차수열 or 등비수열일 때 규칙에 맞게 common 마지막 숫자 다음 숫자 반환
