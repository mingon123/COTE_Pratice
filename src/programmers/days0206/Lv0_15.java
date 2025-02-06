package programmers.days0206;
/*

문제 설명
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

 */
public class Lv0_15 {

	// int a = 12; 입력값 예시 
	// int b = 3; 입력값 예시
	
	public int solution(int a, int b) {
		
		int ab;  // a + b의 정수 배열
		int ab2; // 2 * a * b 
        int answer = 0;
        String a_s = a + ""; // a 문자열 변환
        String b_s = b + ""; // b 문자열 변환
        
        
        ab = Integer.parseInt(a_s + b_s); // 문자열 더한 걸 다시 int로 파싱
        ab2 = 2 * a * b; // 문제에서 제시한 비교값 만들기
        if(ab > ab2) // 값 비교하고 더 큰 걸 반환
        {
        	return answer = ab;
        }
        else {
        	return answer = ab2;
        }
        
    }
	
}
