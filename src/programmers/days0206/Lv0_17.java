package programmers.days0206;
/*
 
 문제 설명
양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.


 */
public class Lv0_17 {

	int n = 7;
	// int sum = 0;
	// int square = 0;
	
	public static void main(String[] args) {
		System.out.println(solution(7));
	}
	public static int solution(int n) {
		int answer = 0;
		int sum = 0; // 합
		int square = 0; // 제곱
		if((n % 2) == 1) { // n이 홀수일 경우
			
			for(int i = 1; i <= n; i++) { // n만큼 반복
				if((i % 2) == 1) { // i가 홀수일 경우
					sum += i; // 홀수 i 더해주기
					
				}

			}
		}
		else {
			for(int i = 1; i <= n; i++) { // n만큼 반복
				if((i % 2) == 0) { // i가 짝수일 경우
					square = i * i; // i 제곱후 저장
					sum += square; // 저장한 제곱 값 더해주기
					
				}
			}
		}
		return answer = sum;
		
	}
	
}
