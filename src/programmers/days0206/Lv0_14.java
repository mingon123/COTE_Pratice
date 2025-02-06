package programmers.days0206;
import programmers.solution.Solution;
/*
문제 설명
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 
 */
public class Lv0_14 { // 여기서 부터 출력 방식 바꿨음. Solution 파일을 따로 만들어서 관리 정답은 각각 파일에 작성
	
	
	public int solution(int a, int b) {
		String max; // 일단 양쪽의 값을 최대 최소 값을 문자열로 저장하기 위해 문자열 변수 선언
		String min; // 문자열 더하기 문자열로 수행하기 위해서
		int answer = 0;
		max = Math.max(a,b) + ""; // 정수 값을 문자열로 바꾸는 방법
		min = Math.min(a,b) + ""; // 양쪽의 값의 크기를 비교 반환하는 함수

		String result = max + min; // 결과를 편하게 저장하기 위한 용도
		String result2 = min + max;
		if(Integer.parseInt(result) > Integer.parseInt(result2)){ // 문자열을 -> 정수로 파싱

			answer =  Integer.parseInt(result); // 정수로 바꿨을 때 결과 비교가 참일 때 반환하는 answer
			
		}
		else {
			
			answer = Integer.parseInt(result2); // 정수로 바꿨을 때 결과 비교가 거짓일 때 반환하는 answer

		} // if
		return answer;
		
		
	}
}





